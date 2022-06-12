import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		System.out.println("\nDeclaracao");
		int a;
		double b;
		String c;
		System.out.println("\nAtribuicao");
		a = 5;
		b = 3;
		;
		System.out.println("\nInicializacao");
		int a2 = 2;
		double b2 = 2;
		String c3 = "3";
		System.out.println("\nIf, else-if e else");
		if (a2 > 5) {
		System.out.println("a2 > 5");
		} else if (a2 > 0) {
		System.out.println("5 > a2 > 0");
		} else {
		System.out.println("a2 < 0");
		}
		System.out.println("\nWhile");
		int i = 0;
		while (i < 10) {
		i = i + 1;
		System.out.println(i);
		}
		System.out.println("\nDo-while");
		int x = 0;
		do {
		x = x + 1;
		System.out.println(x);
		} while (x < 10);
		System.out.println("\nExpressoes");
		double d = (a * b) + 7 + (b * 3);
		System.out.println(d);
		String nome;
		System.out.println("\nInforme o seu nome:");
		Scanner scannernome = new Scanner(System.in);
		nome = scannernome.nextLine();
		System.out.println("\nO nome informado foi:");
		System.out.println(nome);
	}
}
