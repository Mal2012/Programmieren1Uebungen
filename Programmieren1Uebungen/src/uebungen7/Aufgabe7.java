package uebungen7;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Aufgabe7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String satz = sc.nextLine();
		StringTokenizer wort = new StringTokenizer(satz);
	     while (wort.hasMoreTokens()) {
	    	 String bwort = wort.nextToken();
	    	 if(bwort.charAt(bwort.length()-1)=='r'&bwort.charAt(bwort.length()-2)=='e'){
	         System.out.println(bwort);
	    	 }
	     }
	}
}