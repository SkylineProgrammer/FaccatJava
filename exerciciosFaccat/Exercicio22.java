package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float valorHoras;
		float horasTrabalhadas;
		float horasExtras;
		float soma;

		System.out.println("Digite o valor das horas trabalhadas:");
		valorHoras = sc.nextFloat();
		System.out.println("Digite as horas trabalhadas por semana");
		horasTrabalhadas = sc.nextFloat();

		horasExtras = (valorHoras * 50) / 100;

		if (horasTrabalhadas > 40) {
			soma = horasTrabalhadas - 40;
			soma = soma * horasExtras;
			valorHoras = valorHoras * horasTrabalhadas;
			valorHoras = valorHoras + soma;
			valorHoras = valorHoras * 4;
			System.out.println("O valor do salário dele é: " + valorHoras + " com as horas extras");
		} else {
			soma = valorHoras * horasTrabalhadas;
			soma = soma * 4;
			System.out.println("O valor do salário dele é: " + soma);
		}
		
		sc.close();

	}

}
