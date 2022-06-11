import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		int idade;
		System.out.println("Informe a sua idade");
		Scanner scanneridade = new Scanner(System.in);
		idade = scanneridade.nextInt();
		if (idade >= 21) {
		if (idade >= 30) {
		System.out.println("Mais de 30 anos");
		} else {
		System.out.println("Menos de 30 anos");
		}
		System.out.println("Maior de idade nos EUA");
		} else if (idade >= 18) {
		System.out.println("Maior de idade no Brasil");
		} else {
		System.out.println("Menor de idade");
		}
	}
}
