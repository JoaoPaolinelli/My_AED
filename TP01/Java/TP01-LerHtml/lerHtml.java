import java.net.*;
import java.io.*;
import java.nio.charset.Charset;



public class lerHtml {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));


    public static boolean isFim(String entrada){
        return (entrada.length() >= 3 && entrada.charAt(0) == 'F' && entrada.charAt(1) == 'I' && entrada.charAt(2) == 'M');
    }

    public void getPage(URL url, String nomeSERIE) throws IOException {
        char[] contador = new char[30];

        contador[0] = 'a';
        contador[1] = 'e';
        contador[2] = 'i';
        contador[3] = 'o';
        contador[4] = 'u';
        contador[5]  = '\u00e1'; // á
        contador[6]  = '\u00e9'; // é
        contador[7]  = '\u00ed'; // í
        contador[8]  = '\u00f3'; // ó
        contador[9]  = '\u00fa'; // ú
        contador[10] = '\u00e0'; // à
        contador[11] = '\u00e8'; // õ [e crase
        contador[12] = '\u00ec'; // Í
        contador[13] = '\u00f2'; // ò
        contador[14] = '\u00f9'; // ù
        contador[15] = '\u00e3'; // ã
        contador[16] = '\u00f5'; // õ
        contador[17] = '\u00e2'; // ^a
        contador[18] = '\u00ea'; // ê
        contador[19] = '\u00ee'; // ^i
        contador[20] = '\u00f4'; // ô
        contador[21] = '\u00fb'; // ^u

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        int vogalA = 0; int vogalE =0; int vogalI =0; int vogalO =0; int vogalU =0;
        int vogal_a =0; int vogal_e =0; int vogal_i =0; int vogal_o =0; int vogal_u =0;
        int vogal_aa =0; int vogal_ee =0; int vogal_ii =0; int vogal_oo =0; int vogal_uu =0;
        int vogal_aaa =0; int vogal_eee =0; int vogal_iii =0; int vogal_ooo =0; int vogal_uuu =0;
        int vogal_aaaa=0;                                       int vogal_oooo=0; int consoante =0;
        int table =0; int br =0;

//        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        String inputLine;

        while((inputLine = in.readLine())!= null) {

            for (int z=0; z < inputLine.length(); z++){

                String tag ="";
                if(inputLine.charAt(z) == '<'){
                    z++;
                    if (inputLine.charAt(z) == 't'){
                        while(inputLine.charAt(z) != '>'){

                            tag += inputLine.charAt(z);
                            z++;
                        }
                    }
                }
                if (tag.equals("table")){
                    table++;
                    z = inputLine.length();
                }
            }

            for (int k =0; k < inputLine.length(); k++){
                char op = inputLine.charAt(k);
                if (op >= 'a' && op <= 'z') {
                    if (op != 'a' && op != 'e' && op!= 'i' && op != 'o' && op!='u') {
                        consoante++;
                    }
                }
            }

            for (int i = 0; i < inputLine.length(); i++) {

                char op = inputLine.charAt(i);

                switch (op) {
                    case 'a':
                        vogalA++;
                        break;
                    case 'e':
                        vogalE++;
                        break;
                    case 'i':
                        vogalI++;
                        break;
                    case 'o':
                        vogalO++;
                        break;
                    case 'u':
                        vogalU++;
                        break;
                    case '\u00e1': //á
                        vogal_a++;
                        break;
                    case '\u00e9': // é
                        vogal_e++;
                        break;

                    case '\u00ed': // 'í'
                        vogal_i++;
                        break;
                    case '\u00f3': // 'ó'
                        vogal_o++;
                        break;
                    case '\u00fa': // 'ú'
                        vogal_u++;
                        break;
                    case '\u00e0': // 'à'
                        vogal_aa++;
                        break;
                    case '\u00e8': // 'è'
                        vogal_ee++;
                        break;
                    case '\u00ec': // `i
                        vogal_ii++;
                        break;
                    case '\u00f2': // `o
                        vogal_oo++;
                        break;
                    case '\u00f9': // 'ù'
                        vogal_uu++;
                        break;
                    case '\u00e3': //'ã'
                        vogal_aaa++;
                        break;
                    case '\u00f5': // 'õ'
                        vogal_ooo++;
                        break;
                    case '\u00e2': //'â'
                        vogal_aaaa++;
                        break;
                    case '\u00ea': // 'ê'
                        vogal_eee++;
                        break;
                    case '\u00ee': // ^i
                        vogal_iii++;
                        break;
                    case '\u00f4': // 'ô'
                        vogal_oooo++;
                        break;
                    case '\u00fb': // ^u
                        vogal_uuu++;
                        break;

                    default:

                        break;
                }
            }
        }

        in.close();

        MyIO.println("a("+vogalA+") " +"e("+vogalE+") " +"i("+vogalI+") " +"o("+vogalO+") " +"u("+vogalU+") " +
                'á'+"("+vogal_a+") "+ 'é'+"("+vogal_e+") " +'í'+"("+vogal_i+") " +'ó'+"("+vogal_o+") " +'ú'+"("+vogal_u+") "+
                'à'+"("+vogal_aa+") " +'è'+"("+vogal_ee+") " +'ì'+"("+vogal_ii+") " +'ò'+"("+vogal_oo+") "+'ù'+"("+vogal_uu+") " +
                'ã'+"("+vogal_aaa+")" +'õ'+"("+vogal_ooo+")"+
                'â'+"("+vogal_aaaa+") " + 'ê'+"("+vogal_eee+") "+ 'î'+"("+vogal_iii+") "+ 'ô'+"("+vogal_oooo+") "+ 'û'+"("+vogal_uuu+") "+
                "consoante("+consoante+") " + "<br>("+br+") " + "<table>("+table+") "+ nomeSERIE);

        }

    public static void main(String[] args) {


        String[] nomeSerie = new String[5555];
        String[] linkSERIE = new String[5555];
        int idEntrada = 0;

        File file = new File("/home/johnny/html/arquivo.dat");

       URL url = null;

       do {

           nomeSerie[idEntrada] = MyIO.readLine();

        }while(!isFim(nomeSerie[idEntrada++])) ;
        idEntrada--;

        for (int t=0; t < idEntrada; t++){
            if(t%2 != 0){
                linkSERIE[t] = nomeSerie[t];

            }

        }

        for (int i=0; i< idEntrada; i++){
            if (i%2 != 0){

                try {
                    url = new URL(linkSERIE[i]);
                    new lerHtml().getPage(url, nomeSerie[i-1]);
                }catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }

        }

    }
}
