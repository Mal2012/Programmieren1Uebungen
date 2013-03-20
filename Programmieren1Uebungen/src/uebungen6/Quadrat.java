package uebungen6;
public class Quadrat {

	// Quadrat mit verschiedenen Werten
	int[][] quad;

	// Klassenmethode zum Erzeugen von magischen Quadraten für ungerade n
	// falls n gerade liefern Sie null zurück
	public static Quadrat erzeugeMagicQuadrat(int n) {
		int[][] quad = new int[n][n];
		int zeile = n / 2, spalte = n / 2 + 1, m = 0;
if(!(n%2==0)){
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
		return new Quadrat(quad);
}else{
	return new Quadrat(n);
}
	

	}

	// Konstruktor erzeugt eine quadratische Matrix, die alle Elemente mit 0
	// initialisiert
	public Quadrat(int n) {
		this.quad = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				quad[i][k] = 0;
			}
		}

	}

	// Konstruktor erzeugt eine quadratische Matrix und initiliasiert die Matrix
	// mit den Werten von q
	public Quadrat(int[][] q) {
		quad = new int[q.length][q.length];
		for (int i = 0; i < q.length; i++) {
			for (int k = 0; k < q.length; k++) {
				quad[i][k] = q[i][k];
			}
		}

	}

	// Liefert die arithmetische Summe für eine Zeile zurück; zeilennr gibt die
	// Zeile an
	public int zeilenSumme(int zeilennr) {
		int zeilensumme = 0;
		for (int ib = 0; ib < quad.length; ib++) {
			zeilensumme += quad[zeilennr][ib];
		}
		return zeilensumme;
	}

	// Liefert die arithmetische Summe für eine Spalte zurück; spaltennr gibt
	// die Spalte an
	public int spaltenSumme(int spaltennr) {
		int spaltensumme = 0;
		for (int ib = 0; ib < quad.length; ib++) {
			spaltensumme += quad[ib][spaltennr];
		}
		return spaltensumme;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksOben nach
	// RechtsUnten zurück
	public int diagonalSummeOToU() {
		int daousumme = 0;
		for (int ib = 0; ib < quad.length; ib++) {
			daousumme += quad[ib][ib];
		}
		return daousumme;
	}

	// Liefert die arithmetische Summe der Diagonalen von LinksUnten nach
	// RechtsOben zurück
	public int diagonalSummeUToO() {
		int dauosumme = 0;
		for (int ib = 0; ib < quad.length; ib++) {
			dauosumme += quad[quad.length - 1 - ib][ib];
		}
		return dauosumme;

	}

	// gibt true zurück, falls das Qudrat ein magisches Quadrat; ansonsten false
	public boolean isMagic() {
		int summe = zeilenSumme(0);
		boolean ergebnis = true;

		for (int i = 1; i < quad.length; i++)
			if (summe != zeilenSumme(i))
				return false;

		if (ergebnis)
			for (int i = 0; i < quad.length; i++)
				if (summe != spaltenSumme(i))
					return false;

		if (diagonalSummeOToU() != summe || diagonalSummeUToO() != summe)
			return false;

		boolean[] gefunden = new boolean[quad.length * quad.length];
		for (int j = 0; j < gefunden.length; j++)
			gefunden[j] = false;

		for (int i = 0; i < quad.length; i++) {
			for (int j = 0; j < quad[i].length; j++) {
				int wert = this.quad[i][j];
				if (wert > 0 && wert <= quad.length * quad.length) {
					if (!gefunden[quad[i][j] - 1])
						gefunden[quad[i][j] - 1] = true;
					else
						return false;
				} else
					return false;

			}
		}

		for (int i = 0; i < gefunden.length; i++)
			if (!gefunden[i])
				return false;

		return ergebnis;

	}

	// gibt alle aktuellen Werte des Quadrats mit System.out.println aus
	public void print() {
		for (int i = 0; i < quad.length; i++) {
			for (int j = 0; j < quad.length; j++) {

				System.out.print(" " + quad[i][j]);
			}
			System.out.println("");

		}

	}

}
