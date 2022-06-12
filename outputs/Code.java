import java.util.Scanner;

public class Code {
	public static void main(String[] args) {
		int i = 0;
		int max;
		System.out.println("Informe o maximo de repeticoes");
		Scanner scannermax = new Scanner(System.in);
		max = scannermax.nextInt();
		System.out.println("Inicio do while");
		while (i < max) {
		i = i + 1;
		System.out.println(i);
		}
		System.out.println("Fim do while");
		i = 0;
		System.out.println("Inicio do dowhile");
		do {
		i = i + 1;
		System.out.println(i);
		} while (i < max);
		System.out.println("Fim do dowhile");
	}
}
