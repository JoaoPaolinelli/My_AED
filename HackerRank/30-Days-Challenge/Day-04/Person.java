import java.lang.Exception;
import java.io.*;
import java.util.*;

class Person{
    int idade;
    
    Person(){
        this(0);
        System.out.println("Age is not valid, setting age to 0.");
    }
    Person(int idade){
        if (idade < 0){
            
            System.out.println("Age is not valid, setting age to 0.");
            this.idade = 0;
        }
        this.idade = idade;
    }

    void yearPasses(){
        this.idade += 1;
    }

    void amIOld(){
        if(this.idade < 13){
            System.out.println("You are young.");
        }else if(this.idade > 12 && this.idade < 18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
