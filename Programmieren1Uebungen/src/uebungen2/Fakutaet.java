package uebungen2;

import java.math.BigInteger;
import java.util.Scanner;

public class Fakutaet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte n eingeben:");
		int num = sc.nextInt();

		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= num; i++) {
			BigInteger a = BigInteger.valueOf(i);
			result = result.multiply(a);
		}
		System.out.println("n!: " + result);
	}

}
