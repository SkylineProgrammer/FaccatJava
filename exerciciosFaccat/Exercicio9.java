package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário mensal:");
		Float salarioMensal = sc.nextFloat();
		System.out.println("Digite o valor do percentual de reajuste:");
		Float percentualReajuste = sc.nextFloat();

		percentualReajuste = (salarioMensal * percentualReajuste) / 100;

		Float novoSalario = salarioMensal + percentualReajuste;

		System.out.println("O salário com a taxa de reajuste é :" + novoSalario);
		
		sc.close();
	}
}
