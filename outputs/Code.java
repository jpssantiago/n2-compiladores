import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		double n1, n2, media;
		System.out.println("\nNota 1:");
		Scanner scannern1 = new Scanner(System.in);
		n1 = scannern1.nextDouble();
		System.out.println("\nNota 2:");
		Scanner scannern2 = new Scanner(System.in);
		n2 = scannern2.nextDouble();
		System.out.println("\nMedia:");
		media = (n1 * 0.4) + (n2 * 0.6);
		System.out.println(media);
	}
}
