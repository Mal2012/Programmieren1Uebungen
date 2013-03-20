package uebungen2;

public class Power {

	public static void main(String[] args) {
		int n = 5;
		int result = 0;
		int counter = 1;

		while (counter <= n) {
			result = counter;
			counter = counter + 1;
			System.out.print(result + "	");
			System.out.print(result * result + "	");
			System.out.println(result * result * result);
		}

	}

}
