package uebungen1;
import java.util.Scanner;

public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// This is an example how to read in different datatypes from console

		// how to read a boolean value
		System.out.println("Bitte bool eingeben");
		boolean b = sc.nextBoolean();
		System.out.println("Eingelesener Wert war: " + b);

		// how to read a byte value
		System.out.println("Bitte byte eingeben");
		byte by = sc.nextByte();
		System.out.println("Eingelesener Wert war: " +by);

		// how to read a short value
		System.out.println("Bitte short eingeben");
		short s = sc.nextShort();
		System.out.println("Eingelesener Wert war: " +s);

		// how to read an int value
		System.out.println("Bitte int eingeben");
		int i = sc.nextInt();
		System.out.println("Eingelesener Wert war: " +i);

		// how to read an long value
		System.out.println("Bitte long eingeben");
		long l = sc.nextLong();
		System.out.println("Eingelesener Wert war: " +l);

		// how to read an float value
		// BE CAREFUL: TYPE IN a comma NOT a point: e.g. 4,5
		System.out.println("Bitte float eingeben");
		float f = sc.nextFloat();
		System.out.println("Eingelesener Wert war: " +f);

		// how to read an double value
		// BE CAREFUL: TYPE IN a comma NOT a point: e.g. 4,5
		System.out.println("Bitte double eingeben");
		double d = sc.nextDouble();
		System.out.println("Eingelesener Wert war: " +d);

		// how to read a string value
		System.out.println("Bitte String eingeben");
		String st = sc.next();
		System.out.println("Eingelesener Wert war: " +st);

		// how to read a char value
		System.out.println("Bitte char eingeben");
		char c = sc.next().charAt(0);
		System.out.println("Eingelesener Wert war: " +c);
		

		//how to read MORE THAN ONE value
		//Input Example: 34 4,5 Hello 
		System.out.println("Bitte int, float und String eingeben");
		i = sc.nextInt();
		f = sc.nextFloat();
		st = sc.next();
		System.out.println("Eingelesene Werte waren: int=" + "float=" + f +"String=" + st);
		


	}

}
