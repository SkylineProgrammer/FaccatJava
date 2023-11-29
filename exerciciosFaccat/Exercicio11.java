package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salario do vendedor:");
		Float salario = sc.nextFloat();
		System.out.println("Digite o valor fixo que o vendedor recebe por carro:");
		Float valorFixoCarroVendido = sc.nextFloat();
		System.out.println("Digite o valor total das vendas:");
		Float totaldasVendas = sc.nextFloat();
		System.out.println("Digite o número de carros vendidos pelo vendedor:");
		Float quantidadeVendas = sc.nextFloat();

		Float soma = totaldasVendas / quantidadeVendas;
		soma = (soma * 5) / 100;
		soma = soma * quantidadeVendas;
		valorFixoCarroVendido = valorFixoCarroVendido * quantidadeVendas;
		soma = soma + salario + valorFixoCarroVendido;

		System.out.println("O salario final do vendedor é: "+ soma);
		
		sc.close();
	}
}
