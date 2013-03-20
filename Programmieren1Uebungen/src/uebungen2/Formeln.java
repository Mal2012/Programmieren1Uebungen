package uebungen2;

import java.util.Scanner;

public class Formeln {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		double z;
		System.out.println("Bitte x eingeben:");
		x = sc.nextDouble();
		System.out.println("Bitte y eingeben:");
		y = sc.nextDouble();

		// a

		z = ((x * x) * (y * y)) - (4 * x * y) + 4;
		System.out.println("a) " + z);

		// b

		z = ((1 + x * y) * (1 + x * y))
				/ (1 + (1 + x * y) * (1 + x * y) * (1 + x * y) * (1 + x * y));
		System.out.println("b) " + z);

		// c

		z = x * y + (3 - x) * y - y;
		System.out.println("c) " + z);

		// d

		z = 2 * y;
		System.out.println("d) " + z);
	}

}
