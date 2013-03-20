package uebungen4;
import java.util.Scanner;

public class MagischesQuadrat {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		// Eingabe des Grösse des magischen Quadrats n
		do {
			System.out.println("Bitte n eingeben (n ungerade, 2 < n < 10): ");
			n = sc.nextInt();
		} while (n % 2 == 0 || n < 3 || n > 9);

		// Erzeugen einer n x n Matrix
		int[][] quad = new int[n][n];

		// Deklaration und Initialisierung der Variablen zeile, spalte, m
		int zeile = n / 2, spalte = n / 2 + 1, m = 0;

		// Ermittlung des magischen Quadrats
		do {
			m++;
			quad[zeile][spalte] = m;
			zeile--;
			spalte++;
			zeile = (zeile + n) % n;
			spalte %= n;
			if (quad[zeile][spalte] != 0) {
				zeile++;
				spalte++;
				zeile %= n;
				spalte %= n;
			}
		} while (m < n * n);

		// Ausgabe des magischen Quadrats
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m = quad[i][j];
				if (m < 10)
					System.out.print(" ");
				if (m < 100)
					System.out.print(" ");
				System.out.print(" " + m);
			}
			System.out.println("");

		}
	}

}
