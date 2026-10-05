import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double nota;

        System.out.print("Digite uma nota (-1 para encerrar): ");
        nota = scanner.nextDouble();

        while (nota != -1) {

            if (nota >= 0) {
                soma += nota;
                quantidade++;
            } else {
                System.out.println("Nota inválida!");
            }

            System.out.print("Digite uma nota (-1 para encerrar): ");
            nota = scanner.nextDouble();
        }

        if (quantidade > 0) {
            double media = soma / quantidade;

            System.out.println("Quantidade de notas válidas: " + quantidade);
            System.out.printf("Média: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        scanner.close();
    }
}