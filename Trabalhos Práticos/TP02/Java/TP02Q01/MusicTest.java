
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class MusicTest{
    private static int contadora;
    private String id;
    private String nome;
    private String data;
    private String key;
    private int duration_ms;
    private int year;
    private int Explict;
    private int mode;
    private int Popularity;
    private double liveness;
    private double loudness;
    private double speechiness;
    private Double valence;
    private double acousticness;
    private double danceability;
    private double energy;
    private double instrumentalness;
    private List artistas;
    private Date dataReal;
    private float tempo;
    private String reporDado;


    public MusicTest() {};




    public MusicTest(String id, List artistas, String name, String data,
                     double acousticness, double danceability, double instrumentalness,
                     double liveness, double loudness, double speechiness, double energy, int duration_ms) {
        this.id = id;
        this.artistas = artistas;
        this.nome = name;
        this.data = data;
        this.acousticness = acousticness;
        this.danceability = danceability;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.loudness = loudness;
        this.speechiness = speechiness;
        this.energy = energy;
        this.duration_ms = duration_ms;
    };




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
//        resposta = resposta.replaceAll("'", "");
        MyIO.println(resposta);
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

    public static void idReconhecido(MusicTest[] musicas) {
        int isIgual =0;
        String[] entrada = new String[5555];
        int idEntrada = 0;
        do {
            entrada[idEntrada] = MyIO.readLine();
        } while (!isFim(entrada[idEntrada++]));
        idEntrada--;

        for (int k = 0; k < idEntrada; k++) {

            for (int q = 1; q < contadora; q++) {
                if (musicas[q].getId() != null) {
                    if (entrada[k].equals(musicas[q].getId())) {
                        musicas[q].imprimir();
//                        isIgual++;
                    }
                }
            }
        }
//        MyIO.println(isIgual);
    }
//    public static void idExiste(MusicTest[] music){
//        String[] entrada = new String[555];
//        int numEntrada = 0;
//        int sim = 0;
//        int nao =0;
//        do {
//            entrada[numEntrada] = MyIO.readLine();
//            for (int l = 1; l < contadora; l++){
//                if (music[l].getId() !=null){
//                    if (entrada[numEntrada].equals(music[l].getId())){
//                        MyIO.println("SIM");
//                    }
//                }
//            }
//        }while(!isFim(entrada[numEntrada++]));
//        numEntrada--;
//
//
//        for (int k = 0; k < numEntrada; k++) {
//
//            for (int q = 1; q < contadora; q++) {
//                if (music[q].getId() != null) {
//                    if (entrada[k].equals(music[q].getId())) {
//                        sim++;
//                    }else{
//                        nao++;
//                    }
//                }
//            }
//        }
//        MyIO.println(sim + " " + nao);
//    }

    public static MusicTest[] lerArq() throws ParseException {

            MusicTest[] music = new MusicTest[999999];
            int j=1;
            Arq.openRead("/tmp/data.csv");
            String  tmp = Arq.readLine();
            while(Arq.hasNext()){

                tmp = Arq.readLine();
                music[j] = new MusicTest();
                music[j].ler(tmp);
                contadora++;
                j++;
            }
            Arq.close();
            return music;
        }

    public static void main(String[] args) throws ParseException{

        MusicTest[] music;
        music = lerArq();
        idReconhecido(music);
//        idExiste(music);

    }
}

