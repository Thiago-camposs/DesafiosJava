public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pedro");

        Conta contaCorrenteJoao = new ContaCorrente(cliente1);
        Conta contaPoupancaJoao = new ContaPoupanca(cliente1);
        contaCorrenteJoao.depositar(200);
        contaCorrenteJoao.transferir(50, contaPoupancaJoao);

        Conta contaCorrenteMaria = new ContaCorrente(cliente2);
        Conta contaPoupancaMaria = new ContaPoupanca(cliente2);
        contaCorrenteMaria.depositar(500);
        contaPoupancaMaria.depositar(300);

        Conta contaCorrentePedro = new ContaCorrente(cliente3);
        Conta contaPoupancaPedro = new ContaPoupanca(cliente3);
        contaCorrentePedro.depositar(150);
        contaPoupancaPedro.depositar(450);

        System.out.println("-- Extratos das contas --");
        contaCorrenteJoao.imprimirExtrato();
        contaPoupancaJoao.imprimirExtrato();

        contaCorrenteMaria.imprimirExtrato();
        contaPoupancaMaria.imprimirExtrato();

        contaCorrentePedro.imprimirExtrato();
        contaPoupancaPedro.imprimirExtrato();

        System.out.println("\nContas do cliente " + cliente1.getNome() + ":");
        cliente1.listarContas();

        System.out.println("\nContas do cliente " + cliente2.getNome() + ":");
        cliente2.listarContas();

        System.out.println("\nContas do cliente " + cliente3.getNome() + ":");
        cliente3.listarContas();
    }
}
