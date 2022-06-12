import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		int a = 2;
		double b = 5.5;
		String c = "Texto";
		System.out.println("\nIf:");
		if (a > 3) {
		System.out.println("\nA = 5 > 3");
		} else {
		System.out.println("\nA = 5 < 3");
		}
		System.out.println("\nWhile:");
		int i = 0;
		while (i < 10) {
		i = i + 1;
		System.out.println(i);
		}
		System.out.println("\nDo-while:");
		int x = 0;
		do {
		x = i + 1;
		System.out.println(x);
		} while (x < 10);
		System.out.println("\nEntrada de dados:");
		double n1, n2, soma, subtracao, multiplicacao, divisao;
		System.out.println("\nInforme o primeiro numero - inteiro ou decimal:");
		Scanner scannern1 = new Scanner(System.in);
		n1 = scannern1.nextDouble();
		System.out.println("\nInforme o segundo numero - inteiro ou decimal:");
		Scanner scannern2 = new Scanner(System.in);
		n2 = scannern2.nextDouble();
		System.out.println("\nSoma:");
		soma = n1 + n2;
		System.out.println(soma);
		System.out.println("\nSubtracao:");
		subtracao = n1 - n2;
		System.out.println(subtracao);
		System.out.println("\nMultiplicacao:");
		multiplicacao = n1 * n2;
		System.out.println(multiplicacao);
		System.out.println("\nDivisao:");
		divisao = n1 / n2;
		System.out.println(divisao);
	}
}
