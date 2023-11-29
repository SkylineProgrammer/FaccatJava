package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da altura:");
		float altura = sc.nextFloat();
		System.out.println("Digite o valor da base:");
		float base = sc.nextFloat();

		float resultado = altura * base;

		System.out.print("A área do retangulo é: " + resultado);
		
		sc.close();

	}

}
