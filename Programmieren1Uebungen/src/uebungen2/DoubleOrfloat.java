package uebungen2;

public class DoubleOrfloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nenner = 4, zaehler = 14;
		float quotient;
		quotient = zaehler / nenner;
		System.out.println("a) " + quotient);

		quotient = zaehler / nenner;
		System.out.println("b) " + quotient);

		quotient = (float) zaehler / nenner;
		System.out.println("c) " + quotient);
	}

}
