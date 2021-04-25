public class Difference {
    private int[] elementos;
    public int max;
   

    Difference(int[] elemento) {
        this.elementos = new int[elemento.length];
        for(int i = 0;i < elementos.length; i++) {
            this.elementos[i] = elemento[i];
        }
    }
    void computeDifference() {
        int menor = elementos[0];
        int maior = elementos[0];

        for(int i = 1; i < elementos.length; i++) {
            if(elementos[i] > maior) {
                
                maior = elementos[i];
            }else {
                if(elementos[i] < menor) {
                    menor = elementos[i];
                }
            }
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        max = maior - menor;
        System.out.println("Max = " + max);
    }
    int diferencaAbsoluta() {
        return max;
    }
}