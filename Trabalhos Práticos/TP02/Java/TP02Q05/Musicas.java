
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Musicas {
    private static int contadora;
    private String id;
    private String nome;
    private String data;
    private int duration_ms;
    private double liveness;
    private double loudness;
    private double speechiness;
    private double acousticness;
    private double danceability;
    private double energy;
    private double instrumentalness;
    private List artistas;
    private float tempo;

    public Musicas() {};


    public int getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(int duration_ms) {
        this.duration_ms = duration_ms;
    }

    public double getLiveness() {
        return liveness;
    }

    public void setLiveness(double liveness) {
        this.liveness = liveness;
    }

    public double getLoudness() {
        return loudness;
    }

    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    public double getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(double speechiness) {
        this.speechiness = speechiness;
    }

    public double getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(double acousticness) {
        this.acousticness = acousticness;
    }

    public double getDanceability() {
        return danceability;
    }

    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getInstrumentalness() {
        return instrumentalness;
    }

    public void setInstrumentalness(double instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getArtistas() {
        return artistas;
    }

    public void setArtistas(List artistas) {

        this.artistas = artistas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static boolean isReal(String entrada) {
        boolean isReal = true;
        int contVirgula = 0;
        for (int i = 0; i < entrada.length() && isReal; i++) {

            if (entrada.charAt(i) <= '9' || entrada.charAt(i) == '.' || entrada.charAt(i) == ',') {
                if (entrada.charAt(i) == '.' || entrada.charAt(i) == ',') {
                    contVirgula++;
                }
            } else {
                isReal = false;
            }
        }
        if (contVirgula > 1 || contVirgula < 0) {
            isReal = false;
        }
        return isReal;
    }

    public static boolean isInteiro(String entrada) {
        boolean resposta = true;
        char tratamento;
        int tamResp = entrada.length();
        for (int i = 0; i < tamResp; i++) {
            tratamento = entrada.charAt(i);
            if (!Character.isDigit(tratamento)) {
                resposta = false;
            }
        }
        return resposta;
    }

    public static boolean isFim(String musicas) {
        return (musicas.length() == 3 & musicas.charAt(0) == 'F' && musicas.charAt(1) == 'I' && musicas.charAt(2) == 'M');
    }

    public void imprimir() {

        MyIO.setCharset("UTF-8");
        String resposta = this.getId() + " ## " + this.getArtistas().toString().replaceAll("([\"'])", "") + " ## " + this.getNome() + " ## " + this.getData() + " ## " +
                this.getAcousticness() + " ## " + this.getDanceability() + " ## " + this.getInstrumentalness() +
                " ## " + this.getLiveness() + " ## " + this.getLoudness() + " ## " + this.getSpeechiness() + " ## " +
                this.getEnergy() + " ## " + this.getDuration_ms();
        resposta = resposta.replaceAll("\\[\\[", "[");
        resposta = resposta.replaceAll("\"", "");
        MyIO.println(resposta);
    }
            @Override
        public Musicas clone() {

//        id ## artists ## name ## realease date ## acousticness ## danceability ##
//        instrumentalness ## liveness ## loudness ## speechiness ## energy ## duration

            Musicas novaMusica = new Musicas();
            novaMusica.nome = this.nome;
            novaMusica.id = this.id;
            novaMusica.artistas = this.artistas;
            novaMusica.data = this.data;
            novaMusica.acousticness = this.acousticness;
            novaMusica.danceability = this.danceability;
            novaMusica.energy = this.energy;
            novaMusica.instrumentalness = this.instrumentalness;
            novaMusica.liveness = this.liveness;
            novaMusica.loudness = this.loudness;
            novaMusica.speechiness = this.speechiness;
            novaMusica.tempo = this.tempo;

            // Retornou a referencia para o novo objeto (C)
            // O endereco da regiao de memoria onde esta o objeto (Java)
            return novaMusica;
        }


    public void ler(String s) throws ParseException {
        List<String> artista = new ArrayList<>();
        String remover = s.replaceAll("\\['", "");
        remover = remover.replaceAll("]", "");

//        id ## artists ## name ## realease date ## acousticness ## danceability ##
//        instrumentalness ## liveness ## loudness ## speechiness ## energy ## duration

        String[] linha = remover.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

        try {
            if (isData(linha[2])) {
                this.acousticness = 0;
            } else {

                if (!isReal(linha[2])) {
                    this.acousticness = 0;
                } else {
                    this.acousticness = Double.parseDouble(linha[2]);
                }

            }
            artista.add(linha[3]);
            this.artistas = artista;
            if (isReal(linha[4])) {
                this.danceability = Double.parseDouble(linha[4]);
            }
            if (isInteiro(linha[5])) {
                this.duration_ms = Integer.parseInt(linha[5]);
            } else {
                this.duration_ms = 0;
            }
            if (isReal(linha[6])) {

                this.energy = Double.parseDouble(linha[6]);
            }

            this.id = linha[8];
            if (isReal(linha[9])) {
                this.instrumentalness = Float.parseFloat(linha[9]);
                if (linha[9].charAt(0) == '0') {
                    this.instrumentalness = Double.parseDouble(linha[9]);
                }

            } else {
                this.instrumentalness = Double.parseDouble(linha[9]);
            }

            if (isReal(linha[11]) && !linha[11].isEmpty()) {
                this.liveness = Double.parseDouble(linha[11]);
            }
            if (isReal(linha[12])) {
                this.loudness = Double.parseDouble(linha[12]);
            }

            this.nome = linha[14];

            if (isData(linha[16])) {
                if ((linha[16].length() == 4)) {
                    Date date5 = new SimpleDateFormat("yyyy").parse(linha[16]);
                    linha[16] = new SimpleDateFormat("01/01/yyyy").format(date5);
                    this.data = linha[16];
                } else if (linha[16].length() == 7 && linha[16].charAt(0) != '-') {
                    Date date6 = new SimpleDateFormat("yyyy-MM").parse(linha[16]);
                    linha[16] = new SimpleDateFormat("01/MM/yyyy").format(date6);
                    this.data = linha[16];

                } else if (linha[16].length() == 10) {
                    Date date7 = new SimpleDateFormat("yyyy-MM-dd").parse(linha[16]);
                    linha[16] = new SimpleDateFormat("dd/MM/yyyy").format(date7);
                    this.data = linha[16];
                }
            }
            if (isReal(linha[17])) {
                if ((linha[17].length() != 10)) {
                    this.speechiness = Double.parseDouble(linha[17]);
                }
            }
            if (isReal(linha[18])) {
                if (linha[18].length() >= 7) {
                    this.tempo = 0;
                } else {
                    this.tempo = 0;
                }
            } else {
                if (!(linha[18].charAt(0) >= 'a') && !(linha[18].charAt(0) <= 'z')) {
                    this.tempo = Float.parseFloat(linha[18]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getStackTrace();
        }
    }

    public static boolean isConsoante(String entrada) {
        boolean notVogal = true;
        for (int k = 0; k < entrada.length() && notVogal; k++) {
            if (entrada.charAt(k) <= '9' || entrada.charAt(k) != 'a' || entrada.charAt(k) != 'e' && entrada.charAt(k) != 'i' && entrada.charAt(k) != 'o' && entrada.charAt(k) != 'u') {
                notVogal = false;
                k = entrada.length();
            }
        }
        return notVogal;
    }

    public static boolean isData(String s) {
        boolean isData = false;
        if (isReal(s) && !isConsoante(s)) {
            if (s.length() == 4 && Character.isDigit(s.charAt(0))) {
                isData = true;
            } else if (s.length() == 7 && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2))) {
                isData = true;

            } else if (s.length() == 10 && s.charAt(4) == '-' && Character.isDigit(s.charAt(0))) {

                isData = true;
            }
        }
        return isData;
    }

    public static void idReconhecido(Musicas[] musicas) {

        String[] entrada = new String[5555];
        int idEntrada = 0;
        do {
            entrada[idEntrada] = MyIO.readLine();

        } while (!isFim(entrada[idEntrada++]));
        idEntrada--;

        Musicas[] music2 = new Musicas[idEntrada];

        int ll = 0;

        for (int i = 0; i < idEntrada; i++) {
            for (int j = 1; j < contadora; j++) {
                if (musicas[j].getNome() != null){
                    if (entrada[i].equals(musicas[j].getId())){
                        music2[ll] = musicas[j].clone();
                        ll++;
                    }
                }
            }
        }
        ordenarNomes(music2);
    }

    public static Musicas[] lerArq() throws ParseException {

        Musicas[] music = new Musicas[999999];
        int j=1;
        Arq.openRead("/tmp/data.csv");
        String  tmp = Arq.readLine();
        while(Arq.hasNext()){

            tmp = Arq.readLine();
            music[j] = new Musicas();
            music[j].ler(tmp);
            contadora++;
            j++;
        }
        Arq.close();
        return music;
    }
    public static void ordenarNomes(Musicas[] music){

        for (int i = 0; i < music.length ; i++) {
            int menor = i;
            for (int j = i+1; j < music.length; j++) {
                if (music[menor].getNome().compareTo(music[j].getNome()) > 0){
                    menor = j;
                }
            }
            Musicas temp = music[menor];
            music[menor] = music[i];
            music[i] = temp;
        }
        for(Musicas musicas: music){
            musicas.imprimir();
        }
    }
    public static void main(String[] args) throws ParseException{

        Musicas[] music; // Vetor de musicas
        music = lerArq(); // Le csv e trata exceptions. Retorna um vetor com as musicas.
        idReconhecido(music); // Ordenar as musicas a partir do pub.in
    }
}

