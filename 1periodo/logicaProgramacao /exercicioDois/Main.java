import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// exercício neps) "13  - Bondinho"
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();

        int totalAlunosMonitores = a+m;

        if(totalAlunosMonitores <= 50){
            System.out.println("S");

        } else {
            System.out.println("N");
        }

        /// * exercício neps) "148 - Cino e Bino";
        int qtdDedosBino =  scanner.nextInt();
        int qtdDedosCino =  scanner.nextInt();

        int total = qtdDedosBino + qtdDedosCino;
        if (total % 2 == 0) {
            System.out.println("Bino");
        } else {
            System.out.println("Cino");
        }

        /// exercicio neps) "145 - Positivo, Negativo ou Nulo";
        int x = scanner.nextInt();
        if(x > 0) {
            System.out.println("positivo");
        } if(x < 0) {
            System.out.println("negativo");
        } else if(x == 0) {
            System.out.println("nulo");
        }

        /// exercicio neps) "86 - Aprovado ou reprovado";
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double somaNotas = notaA + notaB;
        double mediaNotas = somaNotas/2;

        if (mediaNotas >= 7) {
            System.out.println("Aprovado");
        } else if (mediaNotas >= 4){
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }






}
