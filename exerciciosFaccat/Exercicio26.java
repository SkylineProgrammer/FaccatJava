package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdEstoque, qtdMinima, qtdMaxima;
		float mediaEstoque;

		System.out.println("Digite a quantidade minima do estoque:");
		qtdMinima = sc.nextInt();
		System.out.println("Digite a quantidade maxima do estoque:");
		qtdMaxima = sc.nextInt();
		System.out.println("Digite a quantidade de estoque:");
		qtdEstoque = sc.nextInt();

		mediaEstoque = (qtdMaxima + qtdMinima) / 2;
		System.out.println("Estoque: " + qtdEstoque);
		System.out.println("A media do estoque é: " + mediaEstoque);

		if (qtdEstoque >= mediaEstoque) {
			System.out.println("Não efetuar comprar");
		} else {
			System.out.println("efetuar comprar");
		}
		sc.close();

	}

}
