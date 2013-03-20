package uebungen7;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Aufgabe6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String satz = sc.nextLine();
		StringTokenizer wort = new StringTokenizer(satz);
	     while (wort.hasMoreTokens()) {
	    	 String bwort = wort.nextToken();
	    	 if(bwort.charAt(0)=='b'||bwort.charAt(0)=='B'){
	         System.out.print(bwort+" ");
	    	 }
	     }
	}
}
