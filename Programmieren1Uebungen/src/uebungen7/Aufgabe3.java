package uebungen7;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Aufgabe3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zeile eingeben:");
		String s1 = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		 
		String[] as = new String[st.countTokens()];
		
		 int i= 0;  
		  while (st.hasMoreTokens()) {
		     
			  as[i] = st.nextToken();
			  i++;
		     }
		 
		  
		  for(int j = as.length-1; j>=0; j--){
			  System.out.println(as[j]);
		  }
		
	}

}
