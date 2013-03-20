package uebungen2;

public class Lesbarkeit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Deklaration und Initialierung der Variablen
		 * 
		 */
		double a = 5;
		int d;
		int b = 9;
		int h1 = 32;
		double c;
		// Deklaration Ende

		d = Integer.parseInt(args[0]);
		/** Ausgabe der über den Programmaufruf übergebenen Variable */
		c = a / b;
		/** a/b = 5.0/9 = 0,5555555555555556 */
		a = d - h1;
		/** d-h1 = x-32 */
		a = a * c;
		/** a*c = (x-32)*0,5555555555555556 */

		System.out.println("Input: " + d);
		System.out.println("Output: " + a);
		/** Ausgabe von (x-32)*0,5555555555555556 */

	}

}
