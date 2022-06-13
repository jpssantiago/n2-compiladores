import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("\nNota 1:");
		Scanner scannernota1 = new Scanner(System.in);
		nota1 = scannernota1.nextDouble();
		System.out.println("\nNota 2:");
		Scanner scannernota2 = new Scanner(System.in);
		nota2 = scannernota2.nextDouble();
		media = (nota1 * 0.4) + (nota2 * 0.6);
		System.out.println("\nMedia:");
		System.out.println(media);
	}
}
