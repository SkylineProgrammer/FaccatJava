package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioFixo, totalVendas, comissao, segundaComissao, totalSalario;
		
		System.out.println("Digite o sal�rio do trabalhador:");
		salarioFixo = sc.nextFloat();
		System.out.println("Digite o total de Vendas do trabalhador");
		totalVendas = sc.nextFloat();

		   if (totalVendas <= 1500) {
		      comissao = (totalVendas * 3) / 100;
		      totalSalario = salarioFixo + comissao;
		      System.out.println("O total do sal�rio �: "+totalSalario);
		   } else {
		      segundaComissao = (totalVendas * 5) / 100;
		      totalSalario = salarioFixo + segundaComissao;
		      System.out.println("O total do sal�rio �: "+totalSalario);
		   }
		   sc.close();

}

}
