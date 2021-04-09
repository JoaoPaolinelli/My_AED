public class AlgebraBoleana {

    public static boolean isFim(String s){
//        return (s.length() ==1 && s.charAt(0) =='0');
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    public static String[] numExpressao(String mestre, int number){
        String[] operadorSUPER = new String[10];
        String[] fragmentador;
        fragmentador = mestre.split(" ");

        if(number < 3){
            String operadorA=(fragmentador[3]);
            String operacaoA = fragmentador[3].replaceAll("( )","");
            String operacaoB=(fragmentador[5].replaceAll("( )", ""));

            String lol= operacaoA.replace("("," ");
            String lol2= operacaoB.replace("("," ");

        }else{
            int tamanho = mestre.length();
            String operacaoX = fragmentador[4] + fragmentador[6] + fragmentador[8] + fragmentador[10];
            String lol= operacaoX.replace("("," ");
            String lol2= lol.replace(")"," ");
//            MyIO.println(lol2);
            String[] operador = lol2.split(" ");
            operadorSUPER[0] = operador[0]; operadorSUPER[1] = operador[1]; operadorSUPER[2] = operador[3]; operadorSUPER[3] = operador[4];

        }
        return operadorSUPER;
    }
    public static void valorLetras(String variaveis, int number){
        if(number <3) {

            String[] dividirLetras = variaveis.split(" ");
            String[] letrasProntas = {dividirLetras[0], dividirLetras[1], dividirLetras[2]};
            //Teste - OK
            //        for (int i=0; i< letrasProntas.length;i++){
            //            MyIO.println(letrasProntas[i]);
            //        }
            valorBool(variaveis,3);
        }else{
            String[] dividirLetras = variaveis.split(" ");
            String[] letrasProntas = {dividirLetras[0], dividirLetras[1], dividirLetras[2], dividirLetras[3]};
            //Teste - OK
//                    for (int i=0; i< letrasProntas.length;i++){
//                        MyIO.println(letrasProntas[i]);
//                    }
            valorBool(variaveis,4);
        }
    }
    public static void realOperacao(String[] variaveis, int number, int numA, int numB, int numC){

        boolean A=true;
        boolean B=true;
        boolean C=true;
        String saida = "FALSO";
        if (number<3){

            if(variaveis[0].equals("and")) {
                if (variaveis[1].equals("not") && variaveis[3].equals("not")) {
                    if (numA != 1 && numB != 1) {
                        MyIO.println(saida = "TRUE");
                    }else MyIO.println(saida);
                }
            }
            if (variaveis[0].equals("not")){
                if (numA == 1 && numB ==1){
                    MyIO.println(saida);
                }else MyIO.println("TRUE");
            }
        }
        if(number ==4){
            //B
            if (variaveis[0].equals("and")&& variaveis[1].equals("or") && variaveis[2].equals("not") && variaveis[3].equals("and")){
                if (numB == 1 && numC == 1 && numA == 1){
                    MyIO.println(saida);
                }else if(numA== 1 || numB==0){
                    MyIO.println("TRUE");
                }
                if(numA==0){
                    {
                        if (numB == 1 && numC == 0){
                            MyIO.println("TRUE");
                        }else{
                            MyIO.println(saida);
                        }
                    }
                }
            }
        }

    }

    public static int[] valorBool(String linha, int number){
        int[] numValor = new int[5];
        if(number <3){
            String[] fragmentador;
            fragmentador = linha.split(" ");
            MyIO.println(fragmentador[1]);
            int A= Integer.parseInt(fragmentador[1]);
            int B= Integer.parseInt(fragmentador[2]);
            numValor[0] = number; numValor[1] = A; numValor[2] = B;

        }else{
            String[] fragmentador;
            fragmentador = linha.split(" ");
            MyIO.println(fragmentador[1]);
            int A= Integer.parseInt(fragmentador[1]);
            int B= Integer.parseInt(fragmentador[2]);
            int C= Integer.parseInt(fragmentador[3]);
            numValor[0] = number; numValor[1] = A; numValor[2] = B; numValor[3] = C;

        }
        return numValor;
    }
    public static void getThem(String variaveis, int number){
        int[] recebeValorBool = new int[5];
        String[] recebeStringSuper = new String[3];
        if(number <3){
            valorBool(variaveis, number);
            numExpressao(variaveis,number);
        }else{
            // Metodos(vetores) funcionando
            recebeValorBool =valorBool(variaveis,number);
            recebeStringSuper =numExpressao(variaveis,number);
            MyIO.println(recebeStringSuper[0]);
            MyIO.println(recebeStringSuper[1]);
            MyIO.println(recebeStringSuper[2]);
            MyIO.println(recebeStringSuper[3]);

        }
    }
    public static boolean calcularBoolean(String formula, String numeros){
        MyIO.println(formula);
        MyIO.println(numeros);
        String[] number = numeros.split(",");
        int A = Integer.parseInt(number[0]);
        int B = Integer.parseInt(number[1]);
        boolean answer = Boolean.getBoolean(formula);
        MyIO.println(answer + " ANSWER IS A BITCH");
        return answer;
    }

    public static void main(String[] args){
        String[] entrada = new String[5555];
        int numeroExpressao;
        int idEntrada=0;
        entrada[0] = "3 0 0 0 and(or(A , B) , not(and(B , C)))";
        getThem(entrada[0],4);














//        valorLetras(entrada[idEntrada],4);

        //## Original OPEN.
//        do {
//            entrada[idEntrada] = MyIO.readLine();
//        }while(!isFim(entrada[idEntrada++]));
//
//        //retirar -1 caso de problema
//        for (int i=0; i < idEntrada-1; i++){
//            numExpressao(entrada[i]);
//        }
        //#Original CLOSED.

//        if(numeroExpressao <3){
//            valorBool(entrada[idEntrada], numeroExpressao);
//        }

    }
}
