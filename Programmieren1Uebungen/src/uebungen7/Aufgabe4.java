package uebungen7;
import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte Textzeile eingeben:");
		String s1 = sc.nextLine();
		System.out.println("Bitte Charakter eingeben:");
		String c = sc.next();

		shit(s1, c, -1, 0);
	}

	public static void shit(String s1, String c, int last, int count) {
		if (s1.indexOf(c, last+1) != -1) {
			last = s1.indexOf(c, last+1);
			count++;
			shit(s1, c, last, count);
		} else {
			System.out.println("Count: " + count);
		}
	}
}
