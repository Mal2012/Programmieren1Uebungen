package vorlesung;
public class test {
	int summe = 0;

	public static void main(String[] args) {
		new test().start();
	}

	private void start() {
		int a = 5;
		int b = 11;
		russischeBauernmultiplikation(a, b);
		System.out.println(this.summe);
		// for (int i = a, j = b; i >= 1; i /= 2, j *= 2) {
		// if (i % 2 != 0) {
		// summe += j;
		// }
		// }
		// System.out.println(summe);
	}

	private void russischeBauernmultiplikation(int a, int b) {
		if (a % 2 != 0) {
			this.summe += b;
		}
		if (a >= 1) {
			russischeBauernmultiplikation(a / 2, b * 2);
		}
	}
}
