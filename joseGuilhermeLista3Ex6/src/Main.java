import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 2026;
        int senhaDigitada;
        int tentativas = 0;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextInt();

        while (senhaDigitada != senhaCorreta) {

            tentativas++;

            System.out.println("Senha Incorreta! Tente novamente.");

            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();
        }

        tentativas++;

        System.out.println("Acesso Autorizado!");
        System.out.println("Número total de tentativas: " + tentativas);

        scanner.close();
    }
}