import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		double a, b, c;
		double d;
		System.out.println("\nA:");
		Scanner scannera = new Scanner(System.in);
		a = scannera.nextDouble();
		System.out.println("\nB:");
		Scanner scannerb = new Scanner(System.in);
		b = scannerb.nextDouble();
		System.out.println("\nC:");
		Scanner scannerc = new Scanner(System.in);
		c = scannerc.nextDouble();
		d = c / (a + b + 10);
		System.out.println("\nResultado: ");
		System.out.println(d);
	}
}
