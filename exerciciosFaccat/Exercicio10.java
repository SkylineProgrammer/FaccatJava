package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de Fabrica do carro");
		Float custoFabrica = sc.nextFloat();

		Float distribuidorP = (custoFabrica * 28) / 100;
		Float impostos = (custoFabrica * 45) / 100;

		custoFabrica = custoFabrica + distribuidorP + impostos;

		System.out.println("O valor final do carro com a porcentagem do distribuidor e impostos é de: "+ custoFabrica);
		sc.close();
	}
}
