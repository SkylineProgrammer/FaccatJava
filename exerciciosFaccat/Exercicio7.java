package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		float idadeAnos = sc.nextFloat();
		System.out.println("Digite quantos m�ses completo se passaram esse ano:");
		float idadeMeses = sc.nextFloat();
		System.out.println("Digite o dia do m�s atual:");
		float idadeDias = sc.nextFloat();

		idadeAnos = idadeAnos * 365;
		idadeMeses = idadeMeses * 30;
		float somaDias = idadeAnos + idadeMeses + idadeDias;

		System.out.println("O total de dias que vo�� ja viveu �: " + somaDias);
		
		sc.close();

	}

}
