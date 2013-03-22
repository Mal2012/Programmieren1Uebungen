package kaffeautomat;
public class KaffeeAutomat {
	public static final int FALSCHER_EINWURF = 0;
	public static final int KAFFEE_AUSGEGEBEN = 1;
	public static final int MUENZE_AKZEPTIERT = 2;
	public static final int INTERNAL_ERROR = 3;
	static final byte WARTEND = 1;
	static final byte KAFFEE_AUSGEBEN = 2;
	static final byte WECHSELGELD_RÜCKGABE = 3;
	static final byte AUSGESCHALTET = 4;
	int centBekommen = 0, centBenoetigt = 60;
	byte zustand;
	int[] rueckgabeMuenzen = new int[2];

	
	public KaffeeAutomat() {
		setzeInZustandWartend();
	}

	public void setzeInZustandWartend() {
		centBekommen = 0;
		zustand = WARTEND;
	}

	public void ausschalten() {
		zustand = AUSGESCHALTET;
	}

	public boolean istAusgeschaltet() {
		return zustand == AUSGESCHALTET ? true : false;
	}

	public boolean sindRueckgabeMuenzenVorhanden() {
		if (rueckgabeMuenzen[0] != 0 || rueckgabeMuenzen[1] != 0)
			return true;
		return false;
	}

	int[] rueckgabeMuenzenEntnehmen() {
		if (zustand == WECHSELGELD_RÜCKGABE) {
			int[] entnommeneMuenzen = new int[2];
			for (int i = 0; i < 2; i++) {
				entnommeneMuenzen[i] = rueckgabeMuenzen[i];
				rueckgabeMuenzen[i] = 0;
			}
			setzeInZustandWartend();
			return entnommeneMuenzen;
		}
		return null;

	}

	public void wechselGeldBerechnen() {
		if (zustand == WECHSELGELD_RÜCKGABE) {
			int restbetrag = centBekommen - centBenoetigt;
			int zehner = restbetrag / 10;
			int rest = (restbetrag - (zehner*10)) / 5;

			rueckgabeMuenzen[0] = zehner;
			rueckgabeMuenzen[1] = rest;
		}
	}

	
	public byte einwerfen(int muenze) {
		if (zustand == WARTEND) {
			if ((muenze != 5) && (muenze != 10) && (muenze != 20) && (muenze != 50))
				return FALSCHER_EINWURF;
			centBekommen += muenze;
			if (centBekommen >= centBenoetigt) {
				zustand = KAFFEE_AUSGEBEN;
				kaffeeAusgeben();
				return KAFFEE_AUSGEGEBEN;
				
			}

			return MUENZE_AKZEPTIERT;
		}
		return INTERNAL_ERROR;
	}

	public void kaffeeAusgeben() {
		if (zustand == KAFFEE_AUSGEBEN) {
			if (centBekommen > centBenoetigt) {
				zustand = WECHSELGELD_RÜCKGABE;
				wechselGeldBerechnen();
			} else
				setzeInZustandWartend();

		}
	}

}
