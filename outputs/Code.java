import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		double nota1, nota2;
		System.out.println("\nInforme a nota 1:");
		Scanner scannernota1 = new Scanner(System.in);
		nota1 = scannernota1.nextDouble();
		System.out.println("\nInforme a nota 2:");
		Scanner scannernota2 = new Scanner(System.in);
		nota2 = scannernota2.nextDouble();
		double nf = (nota1 * 0.4) + (nota2 * 0.6);
		System.out.println("\nNota final: ");
		System.out.println(nf);
	}
}
