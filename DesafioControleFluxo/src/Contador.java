import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);//criando scanner

        System.out.println("Insira o primeiro parametro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Insira o primeiro parametro: ");
        int parametroDois = scanner.nextInt();
        scanner.close();//fechando scanner após os dados serem recebidos
        
        try {
			contar(parametroUm, parametroDois);
            //chamando o método contendo a lógica de contagem
		
		}catch (Exception Parametros) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //resposta caso a exception criada ocorra
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
		for(int i=0; i<contagem;i++){
            System.out.println("Imprimindo o número: "+ (i+1));
        }
	}
}
