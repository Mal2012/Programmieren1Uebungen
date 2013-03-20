package uebungen3;

import java.util.Scanner;
public class DreierSumme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben");
		int n=sc.nextInt();
		int result=0;
		for(int c=0; c<=n; c++){
			if(c%3==0&&c>=3){
			result += c;
			if(c==3)
				System.out.print(c);
			else
				System.out.print(" + "+c);
			}
		}
		System.out.print("\n Summe = " + result);
		
	}

}
