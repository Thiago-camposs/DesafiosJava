import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("---Conta Bancaria---");
        System.out.println("Digite 1 para Depositar");
        System.out.println("Digite 2 para Sacar");
        System.out.println("Digite 3 para Consultar");
        System.out.println("Digite 4 para Encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite a quantia que deseja depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo+=deposito;
                    System.out.println("--------------------------------------------");
                    System.out.println("Seu saldo atual é: "+ saldo);
                    System.out.println("--------------------------------------------");
                    System.out.println("O que deseja fazer agora ?\n1-Outro Depósito\n2-Sacar\n3-Consultar saldo\n4-Encerrar");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite a quantia que deseja sacar: ");
                    double saque = scanner.nextDouble();
                    if (saldo>saque) {
                        saldo-=saque;
                        System.out.println("--------------------------------------------");
                        System.out.println("Seu saldo atual é: "+saldo);
                    }else{
                        System.out.println("OPERACAO NAO REALIZADA< SALDO INSUFICIENTE!!!");
                        System.out.println("--------------------------------------------");
                        System.out.println("Seu saldo atual é: "+ saldo);
                    }
                    System.out.println("--------------------------------------------");
                    System.out.println("O que deseja fazer agora ?\n1-Outro Depósito\n2-Sacar\n3-Consultar saldo\n4-Encerrar");
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("--------------------------------------------");
                    System.out.println("Seu saldo atual é: "+saldo);
                    System.out.println("--------------------------------------------");
                    System.out.println("O que deseja fazer agora ?\n1-Outro Depósito\n2-Sacar\n3-Consultar saldo\n4-Encerrar");
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}