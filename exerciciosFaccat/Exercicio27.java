package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio27 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		float valor;
		
		System.out.println("Digite um valor:");
		   valor = sc.nextFloat();
		   
		   if (valor == 0) {
				   System.out.println("O valor � zero");
		   }
		   
		   if (valor > 0) {
		   System.out.println("O valor � positivo");
		   }

		   if (valor < 0) {
		   System.out.println("O valor � negativo");
		   }
		   
		   sc.close();
	}
}
