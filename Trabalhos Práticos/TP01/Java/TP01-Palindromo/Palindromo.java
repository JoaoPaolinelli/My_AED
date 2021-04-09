public class Palindromo {

    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }


    public static String ehPalindromo(String palindromo){
        String temp ="";
        String resp ="";
        for(int i= (palindromo.length() ) - 1; i >= 0; i-- ){
            temp += palindromo.charAt(i);
        }
        if( palindromo.equals(temp)){
            resp = "SIM";
        }else resp = "NAO";

        return resp;
    }
    public static void main(String[] args){
        String[] entrada = new String[1000];
        int numEntrada = 0;

        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--;

        for(int i = 0; i < numEntrada; i++){
            MyIO.println(ehPalindromo(entrada[i]));
        }
    }
}
