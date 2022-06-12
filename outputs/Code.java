import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		int idade;
		int idademinima = 18;
		System.out.println("Informe a sua idade");
		Scanner scanneridade = new Scanner(System.in);
		idade = scanneridade.nextInt();
		int diferenca = idademinima - idade;
		if (idade >= idademinima) {
		System.out.println("Voce esta liberado");
		} else {
		System.out.println("Voce nao pode entrar");
		System.out.println(diferenca);
		}
	}
}
