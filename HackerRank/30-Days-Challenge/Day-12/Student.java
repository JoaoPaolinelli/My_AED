public class Student extends Person {
    private int[] testScores;
    private char grade;
    

    Student(String primeiroNome, String ultimoNome, int identificador, int[] notas) {
        super(primeiroNome, ultimoNome, identificador);
        testScores = notas;
    }

    public char calculate() {

        int total = 0;
        double media = 0.0;
        for (int i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }
        media = total / (testScores.length);

        if(media >= 90) {
            grade = 'O';
        }else if(media >= 80) {
            grade = 'E';
        }else if(media >= 70) {
            grade = 'A';
        }else if (media >= 55) {
            grade = 'P';
        }else if (media >= 40) {
            grade = 'D';
        }else {
            grade = 'T';
        }
        return grade;
    }
}