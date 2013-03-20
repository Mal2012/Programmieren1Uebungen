package uebungen3;

import java.util.Scanner;
public class DreierSummeWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte n eingeben");
		int n=sc.nextInt();
		int result=0;
		int c=0;
		while(c<=n){
			if(c%3==0&&c>=3){
			result += c;
			if(c==3)
				System.out.print(c);
			else
				System.out.print(" + "+c);
			
			
			}
			c++;
		}
		System.out.print("\n Summe = " + result);
		
	}

}
