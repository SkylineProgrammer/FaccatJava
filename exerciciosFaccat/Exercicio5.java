package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para saber o antecessor dele");
		int valor01 = sc.nextInt();

		int antecessor = valor01 - 1;

		System.out.print("O antecessor de " + antecessor +);
		
		sc.close();

	}
}
