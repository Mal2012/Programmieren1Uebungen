package uebungen3;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long x=1, y=0, z=0;
	System.out.println("Bitte Index n eingeben:");
	int n = sc.nextInt();
	
	for(int c=1; c<=n; c++){
		z=x;
		x+=y;
		y=z;
		
	}
	System.out.printf("Fibonacci Zahl: f%d = %d", n, y);

	

	}

}
