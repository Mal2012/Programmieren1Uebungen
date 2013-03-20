package uebungen5;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bitte a eingeben:");
		double inputa = sc.nextDouble();
		System.out.println("Bitte b eingeben: ");
		double inputb = sc.nextDouble();
		
		System.out.println("Hypotenuse c= "+hypotenuse(inputa, inputb));
		
	}

	static double hypotenuse(double a, double b) {
		double result = Math.hypot(a, b);
		//double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return result;

	}
}
