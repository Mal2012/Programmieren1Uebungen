package vorlesung;


public class Senderauswahl {
	int Kanal;
	// String[] Sendername = new String[30];
	String[] Sendername = { "ARD", "ZDF", "BR", "4", "5", "6", "7", "8", "9",
			"10", "ARD1", "ZDF2", "BR3", "44", "55", "66", "77", "88", "99",
			"1010", "ARD2", "ZDF3", "BR4", "45", "56", "67", "78", "89", "910",
			"101" };

	public void Zapping() {
		// Wechsel auf den nächsten Speicherplatz bzw. Sender (Zapping). Auf den
		// letzten Speicherplatz folgt wieder der erste.
		if (Kanal + 1 == 30) {
			Kanal = 0;
		} else {
			Kanal = Kanal + 1;
		}
	}

	public void speicherSendername(int i, String name) {
		Sendername[i] = name;
	}

	public String gebeSendername() {
		return Sendername[Kanal];
	}

	public int sucheSender(String name) {
		for (int a = 0; a < Sendername.length; a++) {
			if (Sendername[a].equals(name)) {
				return a;
			}
		}
		return Kanal;

	}

	@Override
	public String toString() {
		return "Senderauswahl [Kanal=" + Kanal + ", Sendername="
				+ Sendername[Kanal] + "]";
	}

	public Senderauswahl(int kanal) {
		super();
		Kanal = kanal;

	}

}
