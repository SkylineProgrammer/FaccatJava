package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		double soma;

		System.out.println("Digite a quantidade de Ma��s que deseja comprar");
		int quantidadeMacas = sc.nextInt();

		if (quantidadeMacas >= 12) {
			soma = quantidadeMacas * 1;
			System.out.println(quantidadeMacas + " Ma��s, o pre�o fica R$" + soma + ",00");
		} else {	
		   soma =  1.3 * quantidadeMacas;
		  System.out.println(quantidadeMacas + " Ma��s, o pre�o fica R$" + soma);
		}
		
		sc.close();
	}
}
