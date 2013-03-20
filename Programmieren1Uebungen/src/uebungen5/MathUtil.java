package uebungen5;
import java.util.Scanner;

public class MathUtil {

	public static void main(String[] args) {
		// System.out.println(minimum3(3,5,1));
		Scanner sc = new Scanner(System.in);
		printAsteriks(sc.nextInt());
	}

	static boolean isEven(int n) {
		boolean result = false;
		if (n % 2 == 0) {
			result = true;
		}

		return result;
	}

	static int gcd(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			return gcd(b, (a - b));
		}
		return gcd(b, (b - a));
	}

	static float minimum3(float a, float b, float c) {
		float value = Math.min(a, b);
		value = Math.min(value, c);

		return value;
	}

	static int integerPower(int b, int e) {
		return (int) Math.pow(b, e);
	}

	static void printAsteriks(int n) {
		for (int i = 0; i < n; i++) {
			for (int ib = 0; ib < n; ib++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}
