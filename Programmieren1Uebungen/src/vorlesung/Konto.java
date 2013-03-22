package vorlesung;

public class Konto {
public static float zinssatz;
public float kontostand;

public Konto(int betrag){
	this.kontostand = betrag;
}

public Konto() {
	// TODO Auto-generated constructor stub
}

public float einzahlen(int betrag){
	this.kontostand += betrag;
	return kontostand;
}
public float auszahlen(int betrag){
	this.kontostand -= betrag;
	return kontostand;
}
public String toString(){
	return "Kontostand = "+kontostand+" Zinssatz = "+zinssatz;
}


	public static void main(String[] args) {
		byte Betrag = 60;
		Konto k1 = new Konto();
		k1.zinssatz = 3.5f;
		Konto k2 = new Konto();
		k2.zinssatz = 2.0f;
		Konto k3 = k1;
		k2.auszahlen(Betrag);
		k3.einzahlen(100);
		
		System.out.println(k1.kontostand);
		System.out.println(k2.kontostand);
		System.out.println(k3.kontostand);
		
		System.out.println(k1.zinssatz);
		System.out.println(k2.zinssatz);
		System.out.println(k3.zinssatz);

	}

}
