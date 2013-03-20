package uebungen2;

import java.util.Scanner;

public class Zahlensysteme {

	public static void main(String[] args) {
		int inputNumber;
		String inputString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl dezimal ein:");
		inputNumber = sc.nextInt();

		System.out.println("Hex: " + Integer.toHexString(inputNumber));
		System.out.println("Binär: " + Integer.toBinaryString(inputNumber)
				+ "\n");

		System.out.println("Bitte geben Sie eine Zahl hexadezimal ein:");
		inputString = sc.next();
		inputNumber = Integer.parseInt(inputString, 16);

		System.out.println("Dezimal: " + inputNumber);
		System.out.println("Binär: " + Integer.toBinaryString(inputNumber)
				+ "\n");

		System.out.println("Bitte geben Sie eine Zahl binär ein:");
		inputString = sc.next();
		inputNumber = Integer.parseInt(inputString, 2);

		System.out.println("Dezimal: " + inputNumber);
		System.out.println("Hex: " + Integer.toHexString(inputNumber) + "\n");

		System.out.println("Bitte geben Sie eine Zahl octal ein:");
		inputString = sc.next();
		inputNumber = Integer.parseInt(inputString, 8);

		System.out.println("Dezimal: " + inputNumber);
		System.out.println("Hex: " + Integer.toHexString(inputNumber) + "\n");
	}

}
