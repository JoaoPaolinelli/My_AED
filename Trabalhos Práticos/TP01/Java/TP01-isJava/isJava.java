public class isJava {

    public static boolean isVogal(String entrada){

        boolean resposta = true;
        int tamResp= entrada.length();
        for(int i = 0; i < tamResp; i++){
            if (entrada.charAt(i) != 'A' && entrada.charAt(i) != 'E' && entrada.charAt(i) != 'I' && entrada.charAt(i) != 'O' && entrada.charAt(i) != 'U'&& entrada.charAt(i) != 'a' && entrada.charAt(i) != 'e' && entrada.charAt(i) != 'i' && entrada.charAt(i) != 'o' && entrada.charAt(i) != 'u'){
                resposta = false;
                i = tamResp;
            }
        }
        return resposta;
    }

    public static boolean isConsoante(String entrada){
        boolean notVogal = true;
        for (int k = 0; k < entrada.length() && notVogal; k++){
//            if (entrada.charAt(k) != 'a' && entrada.charAt(k) != 'e' && entrada.charAt(k) != 'i' && entrada.charAt(k) != 'o' && entrada.charAt(k) != 'u' && entrada.charAt(k) <= 9 || entrada.charAt(k) == ',' || entrada.charAt(k) == '.') {
            if (entrada.charAt(k) <= '9' || entrada.charAt(k) != 'a' || entrada.charAt(k) != 'e' && entrada.charAt(k) != 'i' && entrada.charAt(k) != 'o' && entrada.charAt(k) != 'u') {
                notVogal = false;
            }
            // isVogal(entrada)
            // ||entrada.charAt(k) != 'a' && entrada.charAt(k) != 'e' && entrada.charAt(k) != 'i' && entrada.charAt(k) != 'o' && entrada.charAt(k) != 'u'
        }
        return notVogal;
    }

    public static boolean isInteiro(String entrada){
        boolean resposta = true;
        char tratamento;
        int tamResp = entrada.length();
        for(int i = 0; i < tamResp; i++){
            tratamento = entrada.charAt(i);
            if (!Character.isDigit(tratamento)){
                resposta = false;
            }
        }
        return resposta;
    }

    public static boolean isReal(String entrada){
        boolean isReal = true;
        int contVirgula = 0;
        for (int i = 0; i < entrada.length() && isReal; i++){

            if (entrada.charAt(i) <= '9' || entrada.charAt(i) == '.' || entrada.charAt(i) == ','){
                if (entrada.charAt(i) == '.' || entrada.charAt(i) == ','){
                    contVirgula++;
                }
            } else {
                isReal = false;
            }
        }
        if (contVirgula > 1 || contVirgula < 0){
            isReal = false;
        }
        return isReal;
    }
    public static void teste(String entrada){
        String[] respostas = new String[4];
        if(isVogal(entrada)){
            respostas[0] = "SIM ";
        }else respostas[0] = "NAO ";
        if (isConsoante(entrada)){
            respostas[1] = "SIM ";
        }else respostas[1] = "NAO ";
        if (isInteiro(entrada)){
            respostas[2] = "SIM ";
        }else respostas[2]= "NAO ";
        if (isReal(entrada)){
            respostas[3] = "SIM";
        }else respostas[3]= "NAO";
        MyIO.println(respostas[0] + respostas[1] + respostas[2] + respostas[3]);
    }
    public static boolean isFim(String entrada){
        return (entrada.length() >= 3 && entrada.charAt(0) == 'F' && entrada.charAt(1) == 'I' && entrada.charAt(2) == 'M');
    }
    public static void main(String[] args){

        String[] entrada = new String[5555];
        int id_entrada = 0;

        do {

            entrada[id_entrada] = MyIO.readLine();

        }while(!isFim(entrada[id_entrada++]));
        id_entrada--;

        for (int i = 0; i < id_entrada; i++){

            teste(entrada[i]);
        }
    }
}