package uebungen5;
import java.util.Scanner;

public class Fibonacci {

	public static long fib(long x, long y, int n, int c) {
		if (n < c)
			return y;
		else {
			long z = x;
			x += y;
			y = z;
			c++;
			return fib(x, y, n, c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Index eingeben");
		int n = sc.nextInt();

		System.out.println("f" + n + " = " + fib(1, 0, n, 1));

	}

}