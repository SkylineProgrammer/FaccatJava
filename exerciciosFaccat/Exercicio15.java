package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para validar como positivo ou negativo:");
		float valor = sc.nextFloat();

		if (valor >= 0) {
			System.out.println("O valor digitado " + valor + " é positivo");
		} else {
			System.out.println("O valor digitado " + valor + " é negativo");
		}
		
		sc.close();
	}
}
