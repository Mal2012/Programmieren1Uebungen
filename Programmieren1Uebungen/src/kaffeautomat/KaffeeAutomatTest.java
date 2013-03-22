package kaffeautomat;
import java.util.Scanner;

public class KaffeeAutomatTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KaffeeAutomat k = new KaffeeAutomat();

		do {

			System.out.println("Bitte Cent Stücke einwerfen 5, 10, 20, 50, -1 (Ausschalten)");
			int muenze = sc.nextInt();
			if (muenze == -1)
				k.ausschalten();
			else {

				byte ergebnis = k.einwerfen(muenze);

				if (ergebnis == KaffeeAutomat.FALSCHER_EINWURF)
					System.out.println("Ungültige Münze eingeworfen");

				else if (ergebnis == KaffeeAutomat.KAFFEE_AUSGEGEBEN) {
					System.out.println("Kaffee wird ausgegeben");

					if (k.sindRueckgabeMuenzenVorhanden()) {
						int[] rueckgabe = k.rueckgabeMuenzenEntnehmen();

						System.out.println("Automat Rückgabe "
								+ (rueckgabe[0] * 10 + rueckgabe[1] * 5)
								+ " Cent: " + rueckgabe[0] + " x 10 cent  "
								+ rueckgabe[1] + " x 5 Cent");
					}
				}

				else if (ergebnis == KaffeeAutomat.MUENZE_AKZEPTIERT)
					System.out.println("Muenze akzeptiert");

				else
					System.out.println("Interner Fehler im Automat");

			}
		} while (!k.istAusgeschaltet());

	}
}
