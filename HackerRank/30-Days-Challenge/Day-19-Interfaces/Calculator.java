public class Calculator implements AdvancedArithmetic {
   
    public int divisorSum(int numero) {
        int total_soma = somaDivisores(numero);
        return total_soma;
    } 
    public int somaDivisores(int numero) {
        int divisor = numero;
        int somarDivisores = 0;
        
        for (int i = numero; i > 0; i--) {
            if(divisor  % i  == 0) {
                somarDivisores += i;
            }
        }
        return somarDivisores;
    }

}
