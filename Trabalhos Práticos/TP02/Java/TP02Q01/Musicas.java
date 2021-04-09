
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Musicas {
        public static int erro2 = 0;
        private String id; // 8
        private ArrayList<String> artistas; // 3
        private Date data; // 16
        private String nome;
        private int duration_ms; // 5
        private int Popularity; // 15
        private double liveness; // 11
        private double loudness; // 12
        private double speechiness;
        private double acousticness; // 2
        private double danceability; // 4
        private double energy; // 6
        private double instrumentalness; // 17

        private float tempo; // 18

        public Musicas() {
            this.id = " ";
            this.artistas = new ArrayList<String>();
            this.nome = "";
            this.data = new Date();
            this.acousticness = Double.parseDouble("");
            this.danceability = Double.parseDouble("");
            this.instrumentalness = Double.parseDouble("");
            this.liveness = Double.parseDouble("");
            this.loudness = Double.parseDouble("");
            this.speechiness = Double.parseDouble("");
            this.energy = Double.parseDouble("");
            this.duration_ms = Integer.parseInt("");
        };

        public Musicas(String[] atributo) throws ParseException, ArrayIndexOutOfBoundsException {
            artistas = new ArrayList<>(); // 3

            String[] artista = atributo[3].split(",");
            for (String pessoa : artista) {
                artistas.add(pessoa);
            }

            this.id = atributo[8];
            this.nome = atributo[14];
            this.acousticness = Double.parseDouble(atributo[2]);
            this.danceability = Double.parseDouble(atributo[4]);
            this.instrumentalness = Double.parseDouble(atributo[9]);
            this.energy = Double.parseDouble(atributo[6]);
            this.tempo = Float.parseFloat(atributo[7]);
            this.liveness = Double.parseDouble(atributo[11]);
            this.loudness = Double.parseDouble(atributo[12]);
            this.speechiness = Double.parseDouble(atributo[17]);


            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            try{


            if (atributo[16].length() == 4) {
                data = formato.parse(atributo[16] + "-01-01");
            } else if(atributo[16].length() == 7) {
                data = formato.parse(atributo[16] + "-01");
            } else {
                data = formato.parse(atributo[16]);
            }
            }catch (ParseException e){

                for (int i = 0; i < 18 ; i++) {
                    MyIO.println(artistas.toString());
                }
                MyIO.println(e.toString());

            }
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ArrayList<String> getArtistas() {
            return artistas;
        }

        public void setArtistas(ArrayList<String> artistas) {
            this.artistas = artistas;
        }

        public Date getData() {
            return data;
        }

        public void setData(Date data) {
            this.data = data;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getDuration_ms() {
            return duration_ms;
        }

        public void setDuration_ms(int duration_ms) {
            this.duration_ms = duration_ms;
        }

        public int getPopularity() {
            return Popularity;
        }

        public void setPopularity(int popularity) {
            Popularity = popularity;
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

        public float getTempo() {
            return tempo;
        }

        public void setTempo(float tempo) {
            this.tempo = tempo;
        }

       @Override
       public Musicas clone() {

       //id ## artists ## name ## realease date ## acousticness ## danceability ##
       //instrumentalness ## liveness ## loudness ## speechiness ## energy ##duration

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

           return novaMusica;
	}

        public void imprimir() { MyIO.println(this.toString());}

        @Override
        public String toString(){
            SimpleDateFormat novaData = new SimpleDateFormat("dd/MM/yyyy");
            return id + " ## " + artistas.toString() + " ## " + nome + " ## " +
                    novaData.format(data) + " ## " + danceability + " ## " +
                    instrumentalness + " ## " + liveness + " ## " + speechiness +
                    " ## " + energy + " ## " + tempo;
    }

}

