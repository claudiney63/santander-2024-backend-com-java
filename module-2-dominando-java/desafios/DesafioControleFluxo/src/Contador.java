import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o primeiro numero: ");
        x = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        y = scanner.nextInt();   
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o  numero " + i++);
        }
	}
}