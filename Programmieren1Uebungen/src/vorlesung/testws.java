package vorlesung;
import java.util.Scanner;
import java.util.StringTokenizer;

public class testws {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Bitte Satz eingeben: ");
		String s = sc.nextLine();
		String output="";
		
		StringTokenizer tokenizer = new StringTokenizer (s);

		while ( tokenizer.hasMoreTokens() )
			  output= tokenizer.nextToken()+" "+output;
		
		System.out.println(output);
	}

}