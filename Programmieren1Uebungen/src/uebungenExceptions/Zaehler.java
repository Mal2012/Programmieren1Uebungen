package uebungenExceptions;
public class Zaehler {
	private int einer;
	private int zehner;

	public int getEiner() {
		return einer;
	}

	public void setEiner(int einer) {
		this.einer = einer;
	}

	public int getZehner() {
		return zehner;
	}

	public void setZehner(int zehner) {
		this.zehner = zehner;
	}

	void erhoeheUmEins() throws EinerUeberlauf {
		setEiner(getEiner() + 1);
		if (getEiner() == 10) {
			throw new EinerUeberlauf("Einer Überlauf");
		}
	}

	void erhoeheUmZehn() throws Ueberlauf {
		setZehner(getZehner() + 1);
		if (getZehner() == 10) {
			throw new Ueberlauf("Fehler aufgetreten: Ueberlauf!");
		}
	}

	void zaehlen() throws Ueberlauf {
		try {
			erhoeheUmEins();
		} catch (EinerUeberlauf e) {
			setEiner(0);
			erhoeheUmZehn();

		}

	}

	public String toString() {
		return "" + zehner + "" + einer;

	}
}
