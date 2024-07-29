public class Main {
    public static void main(String[] args) {
        Motorista acelerar = new Acelerador();
        Motorista embreagem = new Embreagem();
        Motorista marcha = new Marcha();

        Carro carro = new Carro();
        System.out.println("---Trocando Marcha---");
        carro.setMotorista(acelerar);
        carro.acaoMotorista();

        carro.setMotorista(embreagem);
        carro.acaoMotorista();

        carro.setMotorista(marcha);
        carro.acaoMotorista();
        
        carro.setMotorista(acelerar);
        carro.acaoMotorista();
    };
}