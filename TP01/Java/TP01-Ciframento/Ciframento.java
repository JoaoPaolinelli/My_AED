public class Ciframento {

    // Funcao que recebe string
    public static String encoding(String frase){
    int chave = 3; int tamanho = frase.length();
    String temp ="";
    for( int i=0; i< tamanho; i++){
        temp += (char)(frase.charAt(i)+chave);
    }

    return temp;
    }
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static void main(String[] args){

        String[] entrada = new String[1000];
        int idEntrada =0;

        do{
            entrada[idEntrada] = MyIO.readLine();
        }while(!isFim(entrada[idEntrada++]));

        for (int i=0; i< idEntrada; i++){
            MyIO.println(encoding(entrada[i]));
        }

    }
}
