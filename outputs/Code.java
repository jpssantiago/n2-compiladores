import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		String nome;
		int idade;
		double altura;
		System.out.println("Informe o seu nome");
		Scanner scannernome = new Scanner(System.in);
		nome = scannernome.nextLine();
		System.out.println("Informe a sua idade");
		Scanner scanneridade = new Scanner(System.in);
		idade = scanneridade.nextInt();
		System.out.println("Informe a sua altura");
		Scanner scanneraltura = new Scanner(System.in);
		altura = scanneraltura.nextDouble();
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
	}
}
