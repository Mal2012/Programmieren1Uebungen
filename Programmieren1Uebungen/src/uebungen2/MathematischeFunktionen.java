package uebungen2;

import java.util.Scanner;

public class MathematischeFunktionen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		double x, y;
		double a0 = 1.0, a1 = 2.5, a2 = 0.1, a3 = 0.0, a4 = 0.8, a5 = 0.0, a6 = 1.5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben:");
		n = sc.nextInt();
		System.out.println("Bitte m eingeben:");
		m = sc.nextInt();
		System.out.println("Bitte x eingeben:");
		x = sc.nextInt();

		y = Math.log(Math.abs(n - m) * x);
		System.out.println("1) y=" + y);

		y = Math.sin((n * x + m * x) / 2) - Math.cos((n * x - m * x) / 2);
		System.out.println("2) y=" + y);

		y = (((n * x - m * x) / (n + m)) / 2)
				* Math.pow(Math.E, -1 * (n + m) * Math.pow(x, 2));
		System.out.println("3) y=" + y);

		y = (((((a6 * x - a5) * x + a4) * x - a3) * x + a2) * x - a1) * x + a0;
		System.out.println("4) y=" + y);
		double eeX = Math.pow(Math.E, x);
		y = (((Math.pow(eeX + x, 2)) / ((x / 2) + eeX)) - eeX);
		System.out.println("5) y=" + y);
	}

}
