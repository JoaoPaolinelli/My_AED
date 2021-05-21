import java.io.*;
import java.util.*;



public class LogicaAninhada {

    //Constantes
    public static final int taxa_dia = 15;
    public static final int taxa_mes = 500;
    public static final int taxa_ano = 10000;
    
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int entradaI_dia = in.nextInt();
        int entradaII_mes = in.nextInt();
        int entradaIII_ano = in.nextInt();

        int entrada2I_dia = in.nextInt();
        int entrada2II_mes = in.nextInt();
        int entrada2III_ano = in.nextInt();


        int tax = 0;
        if ( entradaIII_ano > entrada2III_ano ) { 
            tax = taxa_ano;

        }else if( entradaIII_ano == entrada2III_ano) {

            if( entradaII_mes > entrada2II_mes ) {
                tax = taxa_mes * (entradaII_mes - entrada2II_mes);

            }else if( entradaII_mes == entrada2II_mes) {
                if(entradaI_dia > entrada2I_dia) {
                    tax = taxa_dia * (entradaI_dia - entrada2I_dia);
                }                
            }
        }
        System.out.println(tax);
        
    }
}
