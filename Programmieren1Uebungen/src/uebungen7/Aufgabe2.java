package uebungen7;
import java.util.Scanner;

public class Aufgabe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte String 1 eingeben:");
		String s1 = sc.next();
		System.out.println("Bitte String 2 eingeben:");
		String s2 = sc.next();

		System.out.println("Bitte Startindex eingeben:");
		int si = sc.nextInt();
		System.out.println("Bitte Anzahl der zu vergleichenden Charakter eingeben: ");
		int ac = sc.nextInt();
		s1.toLowerCase();
		s2.toLowerCase();
		
		System.out.println(s1.regionMatches(0, s2,si, ac));
	}

}
