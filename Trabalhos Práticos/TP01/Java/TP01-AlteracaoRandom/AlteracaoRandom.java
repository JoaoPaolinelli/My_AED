import java.util.Random;

public class AlteracaoRandom {
//
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String geradorCaractere(String resultado){
        Random gerador = new Random();
        gerador.setSeed(4);

        char aleatorio =(char) ('a' + Math.abs(gerador.nextInt() % 26));
        char aleatorio_secundario =(char) ('a' + Math.abs(gerador.nextInt() % 26));
//        char aleatorio_terceiro=(char) ('a' + Math.abs(gerador.nextInt() % 26));

        resultado = aleatorio+""+aleatorio_secundario;

        return resultado;
    }
    public static String caractereModify(String caracteres, String palavra){
        String x= String.valueOf(caracteres.charAt(0));
        String z = String.valueOf(caracteres.charAt(1));
//        System.out.println(x);
//        System.out.println(z);
        palavra = palavra.replace(x, z);
        return palavra;

    }
    public static void main(String[] args){

        String[] entrada = new String[5555];
        String caracteres ="";
        int idEntrada =0;

        do {
            entrada[idEntrada] = MyIO.readLine();
        }while(!isFim(entrada[idEntrada++]));

        for (int i=0; i < idEntrada; i++){
            MyIO.println(caractereModify(geradorCaractere(caracteres), entrada[i]));
        }

    }
}
