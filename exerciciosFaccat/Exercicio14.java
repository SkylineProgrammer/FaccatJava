package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para validar se � maior que 10 ou n�o:");
		float valor = sc.nextFloat();

		if (valor > 10) {
			System.out.println("O valor " + valor + " � maior que 10");
		}

		if (valor == 10) {
			System.out.println("O valor � igual a " + valor);
		}

		if (valor < 10) {
			System.out.println("O valor " + valor + " � menor que 10");
		}
		
		sc.close();
	}
}
