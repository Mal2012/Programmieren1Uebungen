package uebungen3;
import java.util.Arrays;
import java.util.Scanner;


public class Minimum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bitte Anzahl der Zahlen eingeben:");
		int count = sc.nextInt();
		int value = Integer.MAX_VALUE;
		for(int i=0;i<count;i++){
			System.out.println("Bitte Zahl eingeben:");
			value=Math.min(value, sc.nextInt());
		}
		
		System.out.println("Das Minimum ist: "+value);
		
		/*
		System.out.println("Bitte Anzahl der Zahlen eingeben:");
		int anz = sc.nextInt();
		int[] array =new int[anz];
		
		for(int i=1; i<=array.length; i++){
			System.out.println("Bitte "+i+". Zahl eingeben:");
			array[i-1] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Minimum: "+array[0]);
	*/
	
	}

}
