
import java.io.ObjectInput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Musicas {
    private static int contadora;
    private String id;
    private String nome;
    private String data;
    private Date data2;
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
    private int popularidade;
    private String[] sortMusic;

    Musicas() {};

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

    public float getTempo() {
        return tempo;
    }
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(int duration_ms) {
        this.duration_ms = duration_ms;
    }

    public Date getData2() {
        return data2;
    }

    public void setData2(Date data2) {
        this.data2 = data2;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String[] getSortMusic() {
        return sortMusic;
    }

    public void setSortMusic(String[] sortMusic) {
        this.sortMusic = sortMusic;
    }

    public void imprimir() {
        SimpleDateFormat novaData = new SimpleDateFormat("dd/MM/yyyy");
        MyIO.setCharset("UTF-8");
        String resposta = this.getId() + " ## " + this.getArtistas().toString().replaceAll("([\"'])", "") + " ## " + this.getNome() + " ## " + novaData.format(data2) + " ## " +
                this.getAcousticness() + " ## " + this.getDanceability() + " ## " + this.getInstrumentalness() +
                " ## " + this.getLiveness() + " ## " + this.getLoudness() + " ## " + this.getSpeechiness() + " ## " +
                this.getEnergy() + " ## " + this.getDuration_ms() + this.getPopularidade();
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
            novaMusica.duration_ms = this.duration_ms;
            novaMusica.data2 = this.data2;
            novaMusica.popularidade = this.popularidade;
            novaMusica.sortMusic = this.sortMusic;

            // Retornou a referencia para o novo objeto (C)
            // O endereco da regiao de memoria onde esta o objeto (Java)
            return novaMusica;
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

    private static boolean isConsoante(String entrada) {
        boolean notVogal = true;
        for (int k = 0; k < entrada.length() && notVogal; k++) {
            if (entrada.charAt(k) <= '9' || entrada.charAt(k) != 'a' || entrada.charAt(k) != 'e' && entrada.charAt(k) != 'i' && entrada.charAt(k) != 'o' && entrada.charAt(k) != 'u') {
                notVogal = false;
                k = entrada.length();
            }
        }
        return notVogal;
    }

    private static boolean isData(String s) {
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

            if (isInteiro(linha[5])){
                this.duration_ms = Integer.parseInt(linha[5]);

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
            this.popularidade = (int)(Double.parseDouble(linha[15]));


            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            if (isData(linha[16])) {
                if ((linha[16].length() == 4)) {
                    this.data2 = formato.parse(linha[16] + "-01-01");

                } else if (linha[16].length() == 7 && linha[16].charAt(0) != '-') {
                    this.data2 = formato.parse(linha[16] + "-01");


                } else if (linha[16].length() == 10) {
                    this.data2 = formato.parse(linha[16]);

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
}

public class Main {

    public static int QNT_MUSICA = 0;


    public static void mergeSort(int esq, int dir, Musicas[] music){
        if (esq < dir){
            int meio = (esq + dir) / 2;
            mergeSort(esq, meio, music);
            mergeSort(meio + 1, dir, music);
            intercalar(esq, meio, dir, music);
        }
    }
    public static void sortX(Musicas[] music) {
        mergeSort(0, music.length-1, music);

    }
    public static void intercalar(int esq, int meio, int dir, Musicas[] music){
        int tamEsquerda, tamDireita;

        //Definir tamanho dos dois subarrays
        tamEsquerda = ( meio + 1 ) - esq;
        tamDireita = dir - meio;

        Musicas[] vetEsquerda = new Musicas[tamEsquerda];
        Musicas[] vetDireita = new Musicas[tamDireita];

        int contadorEsq, contadorDir, i = esq;

        //Inicializar primeiro subarray
        for(contadorEsq = 0; contadorEsq < tamEsquerda; contadorEsq++){
            vetEsquerda[contadorEsq] = music[esq + contadorEsq];
        }

        //Inicializar segundo subarray
        for(contadorDir = 0; contadorDir < tamDireita; contadorDir++){
            vetDireita[contadorDir] = music[(meio+1)+contadorDir];
        }

        //Sentinelas no final do array
        contadorEsq = 0;  contadorDir = 0;


        while(contadorEsq < tamEsquerda && contadorDir < tamDireita){
            if (vetEsquerda[contadorEsq].getEnergy() <= vetDireita[contadorDir].getEnergy()){
                music[i] = vetEsquerda[contadorEsq];
                contadorEsq++;
            }else{
                music[i] = vetDireita[contadorDir];
                contadorDir++;
            }
            i++;
        }
        // Check Esquerda
        while(contadorEsq < tamEsquerda){
            music[i] = vetEsquerda[contadorEsq];
            contadorEsq++;
            i++;
        }
        // Check Direita
        while(contadorDir < tamDireita){
            music[i] = vetDireita[contadorDir];
            contadorDir++;
            i++;
        }

    }

    public static Musicas[] lerArq(String[] idsEntrada, int tam) throws ParseException {
        int i = 0;
        Musicas[] musicsOut = new Musicas[170626];
        Musicas musicaTemp;

        Arq.openRead("/tmp/data.csv");
        String tmp = Arq.readLine();
        while (Arq.hasNext()) {
            tmp = Arq.readLine();
            musicaTemp = new Musicas();
            musicaTemp.ler(tmp);
            for (int j = 0; j < tam; j++) {
                if (musicaTemp.getId() != null && musicaTemp.getId().equals(idsEntrada[j])) {
                    musicsOut[i] = musicaTemp.clone();
//                    MyIO.println(musicsOut[i].getDuration_ms());
//                    musicsOut[i].imprimir();
                    QNT_MUSICA++;
                    i++;
                }
            }
        }

        Arq.close();
        return musicsOut;
    }

    public static boolean isFim(String musicas) {
        return (musicas.length() == 3 & musicas.charAt(0) == 'F' && musicas.charAt(1) == 'I' && musicas.charAt(2) == 'M');
    }

    public static void main(String[] args) throws ParseException {
        // Energy
        Musicas[] music; // Vetor de musicas
        Musicas[] musicSort;

        // Leitura padrao pub.in
        String[] entrada = new String[5555];
        int idEntrada = 0;
        do {
            entrada[idEntrada] = MyIO.readLine();
        } while (!isFim(entrada[idEntrada++]));
        idEntrada--;

        music = lerArq(entrada, idEntrada); // Le csv e trata exceptions. Retorna um vetor com as musicas.
        musicSort = new Musicas[QNT_MUSICA];


        // Novo vetor de musicas a serem ordenados.
        int k=0;
        for (int i = 0; i < music.length; i++) {

            if (music[i] != null){

                musicSort[k] = music[i];
//                musicSort[k].imprimir();
                k++;
            }
        }

        sortX(musicSort);
        for (int i = 0; i < musicSort.length; i++) {
            musicSort[i].imprimir();
        }

    }
}


