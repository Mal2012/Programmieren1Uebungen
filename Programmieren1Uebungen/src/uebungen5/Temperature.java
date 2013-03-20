package uebungen5;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Temperatur in Fahrenheit eingeben: ");
			float input = sc.nextFloat();
		System.out.print("In Celcius: ");
		System.out.println(toFahrenheit(input));
		/*
		 * System.out.print("In Fahrenheit: ");
		 * System.out.println(toFahrenheit(input));
		 */
		
	}

	static float toCelcius(float n) {
		return  5.0f / 9.0f * (n - 32);
	}

	static float toFahrenheit(float n) {
		return 9.0f / 5.0f * n + 32;
	}

}
