package uebungen4;
public class Anweisungen {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		float total = 0f;
		float[] fractions = new float[ARRAY_SIZE];


		for (int i = 0; i < fractions.length; i++) {
			fractions[i] = 0f;
		}

		fractions[3] = 4.5f;
		fractions[ARRAY_SIZE-1] = 3.5f;

		for (int i = 0; i < fractions.length; i++) {
			total += fractions[i];
		}
		System.out.println(total);
	}

}
