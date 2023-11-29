import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("==============================================");
        System.out.println("CONTA BANCÁRIA");
        System.out.println("==============================================");


        System.out.print("Digite o seu nome completo: ");
        String clientName = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agency = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        int numberAccount = scanner.nextInt();

        System.out.print("Por favor, informe o seu saldo (Ex: 1000.00): ");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println();
        System.out.println("==============================================");
        System.out.println("CONCLUÍDO!");
        System.out.println("==============================================");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                clientName, agency, numberAccount, balance);
    }
}