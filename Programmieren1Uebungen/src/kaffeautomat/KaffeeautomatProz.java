package kaffeautomat;
import java.util.Scanner;

public class KaffeeautomatProz {

	static final byte INIT = 0;
	static final byte WARTEND = 1;
	static final byte KAFFEE_AUSGEBEN = 2;
	static final byte WECHSELGELD_RÜCKGABE = 3;
	static final byte AUSGESCHALTET = 4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int centBekommen = 0, centBenoetigt = 60;
		byte zustand = INIT;
		int muenze = 0;

		do {
			switch (zustand) {

			case INIT:
				zustand = WARTEND;
				break;

			case WARTEND:
				System.out.println("Bitte Cent Stücke einwerfen 5, 10, 20, 50, -1 (Ausschalten)");
				muenze = sc.nextInt();
				if (muenze == -1)
					zustand = AUSGESCHALTET;
				else {
					if ((muenze != 5) && (muenze != 10) && (muenze != 20)
							&& (muenze != 50))
						System.out.println("Ungültige Münze eingeworfen");
					else {
						centBekommen += muenze;
						if (centBekommen >= centBenoetigt) {
							zustand = KAFFEE_AUSGEBEN;
						}
					}
				}
				break;

			case KAFFEE_AUSGEBEN:
				System.out.println("Kaffee wird ausgegeben");
				if (centBekommen > centBenoetigt) {
					zustand = WECHSELGELD_RÜCKGABE;
				} else {
					centBekommen = 0;
					zustand = WARTEND;
				}
				break;

			case WECHSELGELD_RÜCKGABE:
				int restbetrag = centBekommen - centBenoetigt;


				int zehner = restbetrag / 10;
				int rest = (restbetrag - (zehner * 10)) / 5;
				System.out.println("Automat Rückgabe:" + zehner
						+ " x 10 cent  " + rest + " x 5 Cent");
				centBekommen = 0;
				zustand = WARTEND;
				break;
				
			}

		} while (zustand != AUSGESCHALTET);

		System.out.println("Automat ausgeschaltet");
	}
}
