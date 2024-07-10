public abstract class Conta implements IConta{
    private static final int agenciaPadrao=1;
    private static int sequencial=1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    
    public Conta(){
        this.agencia = Conta.agenciaPadrao;
        this.numero = sequencial++;
    }//construtor
    
    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
