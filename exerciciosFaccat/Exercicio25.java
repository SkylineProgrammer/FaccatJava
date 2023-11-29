package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float numeroConta;

		float saldo, debito, credito, saldoAtual;

		System.out.println("Digite o numero da Conta do cliente:");
		numeroConta = sc.nextFloat();
		System.out.println("Digite o saldo do cliente:");
		saldo = sc.nextFloat();
		System.out.println("Digite o debito do cliente:");
		debito = sc.nextFloat();
		System.out.println("Digite o credito do cliente:");
		credito = sc.nextFloat();
		
		saldoAtual = saldo - debito + credito;
		System.out.println("O saldo atual é: " + saldoAtual);

		if (saldoAtual >= 0) {
			System.out.println("Saldo Atual Positivo");
		} else {
			System.out.println("Saldo Atual Negativo");
		}
		
		sc.close();
		
	}
}
