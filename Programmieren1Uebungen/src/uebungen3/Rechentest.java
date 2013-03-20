package uebungen3;
import java.util.Scanner;

public class Rechentest {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int x1, x2;
			String op = null;
			int result = 0;
			int o = (int) (Math.random() * 4);
			x1 = (int) (Math.random() * 33);
			x2 = (int) (Math.random() * 33);

			switch (o) {
			case 0:
				op = "+";
				result = x1 + x2;
				break;
			case 1:
				op = "-";
				result = x1 - x2;
				break;
			case 2:
				op = "*";
				result = x1 * x2;
				break;
			case 3:
				op = ":";
				if (x2 != 0) {
					result = x1 / x2;
				} else {
					op = "+";
					result = x1+x2;
				}
				break;
			}

			System.out.println(x1 + op + x2 + "=");
			int ergebnis = sc.nextInt();

			if (ergebnis == result) {
				System.out.println("Richtig!");
			} else {
				System.out.println("Falsch!");
			}
		}
	}

}
