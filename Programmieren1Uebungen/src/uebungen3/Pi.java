package uebungen3;
import java.util.Scanner;


public class Pi {

	public static void main(String[] args) {
		double pihalbe = 1.0;
		double j = 1.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Berechnungen eingeben:");
		double n=sc.nextDouble();
		for(double i=1; i<n; i++, j++){
			if(i%2==0)
				pihalbe *= (j/(j+1));
			else
				pihalbe *= ((j+1)/j);
		}
	
	System.out.println("Berechnet: "+pihalbe*2.0);
	System.out.println("Math.PI:   "+ Math.PI);
	}

}
