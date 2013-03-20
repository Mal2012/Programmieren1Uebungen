package uebungen7;
import java.util.Scanner;
public class Aufgabe9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Addition oder Multiplikation eingeben:");
		String eingabe = sc.nextLine();
		for (int i = 0; i < eingabe.length(); i++)
			if (eingabe.regionMatches(i, "+", 0, 1)) {
				String[] op = eingabe.split("\\+");
				int a = Integer.parseInt(op[0]), b = Integer.parseInt(op[1]);
				System.out.println(op[0] + "+" + op[1] + "=" + (a + b));
			} else if (eingabe.regionMatches(i, "*", 0, 1)) {
				String[] op = eingabe.split("\\*");
				int a = Integer.parseInt(op[0]), b = Integer.parseInt(op[1]);
				System.out.println(op[0] + "*" + op[1] + "=" + a * b);
			}
	}
}
