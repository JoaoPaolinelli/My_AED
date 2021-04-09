import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.EnumMap;
import java.util.Random;

public class ArquivoJava {

    public static void tratarARQUIVO(Double[] entrada, int numElementos) {
            try {
                double numero =0;
                RandomAccessFile arquivoRANDOM = new RandomAccessFile("arquivoNovo.dat", "rw");
                arquivoRANDOM.getFilePointer();

                for (int i = 0; i < numElementos; i++) {
                    numero = entrada[i];
                    arquivoRANDOM.getFilePointer();
                    arquivoRANDOM.writeDouble(numero);

                }

                for (long j = arquivoRANDOM.getFilePointer() -8; j > 0; j -= 8){

                    arquivoRANDOM.seek(j);
                    double aux = arquivoRANDOM.readDouble();
                    if (aux / (int)aux == 1 ){

                        MyIO.println((int)aux);

                    }else
                        MyIO.println(aux);

                }



            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public static void main(String[] args){

            Double[] entrada = new Double[5555];
            int numElementos = 0;
                do {
                    entrada[numElementos] = MyIO.readDouble();
                } while (numElementos++ != entrada[0]);
//                MyIO.println(numElementos);
            tratarARQUIVO(entrada, numElementos);
        }
    }










