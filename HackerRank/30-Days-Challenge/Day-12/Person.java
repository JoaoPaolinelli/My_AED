import java.util.*;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(){}

    Person(String primeiroNome, String ultimoNome, int identificador) {

        this.firstName = primeiroNome;
        this.lastName = ultimoNome;
        this.idNumber = identificador;
    }
    
    public void imprimir() {

        System.out.println( "Nome: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}
