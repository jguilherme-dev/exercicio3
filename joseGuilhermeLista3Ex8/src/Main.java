import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de doações: ");
        int quantidade = scanner.nextInt();

        double total = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Digite o valor da doação " + i + ": R$ ");
            double doacao = scanner.nextDouble();

            total += doacao;

            if (i == 1) {
                maior = doacao;
                menor = doacao;
            } else {
                if (doacao > maior) {
                    maior = doacao;
                }

                if (doacao < menor) {
                    menor = doacao;
                }
            }
        }

        System.out.printf("%nValor total arrecadado: R$ %.2f%n", total);
        System.out.printf("Maior doação: R$ %.2f%n", maior);
        System.out.printf("Menor doação: R$ %.2f%n", menor);

        scanner.close();
    }
}