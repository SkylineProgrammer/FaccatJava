package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1;
		int valor2;

		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O primeiro valor é maior que o segundo valor");
		}

		if (valor2 > valor1) {
			System.out.println("O segundo valor é maior que o primeiro valor");
		}

		if (valor1 == valor2) {
			System.out.println("Os valores são iguais");
		}

		sc.close();

	}
}
