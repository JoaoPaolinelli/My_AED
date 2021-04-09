public class Pesquisa {

    public static boolean isFim(String s){
        return s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M';
    }
    public static void entradaPadrao(){
        String[] entrada = new String[555];
        int numEntrada = 0;
        do {
            entrada[numEntrada] = MyIO.readLine();

        }while(!isFim(entrada[numEntrada++]));
        numEntrada--;

        entradaPesquisa(entrada, numEntrada);
    }
    public static void entradaPesquisa(String[] entradaPadrao, int numEntrada){

        String[] entrada = new String[555];
        int resposta =0;
        int idEntrada = 0;
        do {
            entrada[idEntrada] = MyIO.readLine();
        }while(!isFim(entrada[idEntrada++]));
        idEntrada--;

        for (int i = 0; i < idEntrada; i++) {
            for (int j = 0; j < numEntrada; j++) {
                resposta=0;
                if (entradaPadrao[j].equals(entrada[i])){
                    resposta++;
                    j = numEntrada;
                }
            }
            if (resposta >= 1){
                MyIO.println("SIM");
            }else{
                MyIO.println("NAO");
            }
        }
    }

    public static void main(String[] args) {

        entradaPadrao();

    }
}
