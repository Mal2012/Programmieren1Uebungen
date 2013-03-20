package uebungenExceptions;
public class ZaehlerTest {

	public static void main(String[] args) {
		Zaehler z = new Zaehler();

		while (true) {
			try {
				z.zaehlen();
				System.out.println(z);
			} catch (Ueberlauf e) {
				System.out.println(e);
				System.exit(1);
			}
		}

	}
}
