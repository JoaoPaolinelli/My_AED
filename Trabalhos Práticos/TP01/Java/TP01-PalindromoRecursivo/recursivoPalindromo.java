public class recursivoPalindromo {

    public static boolean isFim(String s){
        return (s.length() >= 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static boolean isPalindromo(String s){
        return (isPalindromo(s, 0));
    }

    public static boolean isPalindromo(String entrada, int i){
        boolean resp = true;

        if(i < entrada.length()/2){
            if(entrada.charAt(i) != entrada.charAt(entrada.length()-1-i)){
                resp = false;
                i = entrada.length();
            }else
                resp = isPalindromo(entrada, i+1);
        }
        return resp;
    }

    public static void main(String args[]){
        String[] entrada = new String[1000];
        int numEntrada = 0;

        do{
            entrada[numEntrada] = MyIO.readLine();
        }while(!isFim(entrada[numEntrada++]));
        numEntrada--;

        for(int i = 0; i < numEntrada; i++){
            if(isPalindromo(entrada[i]))
                MyIO.println("SIM");
            else
                MyIO.println("NAO");
        }
    }
}
