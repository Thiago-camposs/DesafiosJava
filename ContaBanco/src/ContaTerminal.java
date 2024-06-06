import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        int agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Olá, bem vindo ao app de contas do banco ---");
        System.out.println("Por favor digite o seu nome: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = scanner.nextInt();
        System.out.println("Por favor digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco,\nsua agência é " + agencia + ", conta " + numeroConta + "\nseu saldo de:" + saldo + " já está disponível para saque");
        scanner.close();
    }
}
