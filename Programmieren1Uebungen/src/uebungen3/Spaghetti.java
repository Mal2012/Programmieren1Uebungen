package uebungen3;
import java.util.Scanner;

public class Spaghetti {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();

		if (x != 0) {
			if (x > 2005) {
				x = Math.sqrt(x);
			} else {
				x = x * (x + x);
			}
			x = x * x;
		}

		// Vereinfacht werden kann dieser Block durch:
		//
		// if (x <= 2005)
		// x = 4 * Math.pow(x, 4);

		System.out.println("Ergebnis: " + x);
	}
}