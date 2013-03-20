package uebungen7;
import java.util.Scanner;
public class Aufgabe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Satz eingeben:");
		String eingabe = sc.nextLine();
		String[] result = eingabe.split("\\s");
		for (int x = 0; x < result.length; x++) {
			StringBuffer satz = new StringBuffer(result[x]);
			int laenge = satz.length() - 1;
			if (satz.charAt(laenge) == '.' || satz.charAt(laenge) == ','
					|| satz.charAt(laenge) == '!' || satz.charAt(laenge) == '?') {
				laenge = laenge - 1;
			}
			if (satz.length() > 3) {
				for (int i = 1; i <= (laenge) / 2; i++) {
					char cs = satz.charAt(i);
					satz.setCharAt(i, satz.charAt(laenge - i));
					satz.setCharAt(laenge - i, cs);
				}
				System.out.print(satz + " ");
			} else {
				System.out.print(satz + " ");
			}
		}
	}
}
