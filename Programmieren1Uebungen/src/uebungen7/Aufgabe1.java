package uebungen7;
import java.util.Scanner;

public class Aufgabe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte String eingeben:");
		String s1 = sc.next();
		System.out.println("Bitte zweiten String eingeben:");
		String s2 = sc.next();
		
		if(s1.compareTo(s2)==0){
			System.out.println("Strings sind gleich!");			
		}else if(s1.compareTo(s2)>0){
			System.out.println("String s1 ist größer!");
			
		}else{
			System.out.println("String s2 ist größer!");
		}
		
	}


}
