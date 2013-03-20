package uebungen7;

public class Aufgabe8 {

	public static void main(String[] args) {
		String[] article = { "the" , "a" , "one" , "some", "any"};
		String[] noun = {"boy", "girl", "dog", "town", "car"};
		String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		for(int i=0; i<20; i++){
			int number1 = (int) (Math.random()*5);
			int number2 = (int) (Math.random()*5);
			int number3 = (int) (Math.random()*5);
			int number4 = (int) (Math.random()*5);
			int number5 = (int) (Math.random()*5);
			int number6 = (int) (Math.random()*5);
			
			StringBuffer wort = new StringBuffer(article[number1]);

			
			wort.setCharAt(0, Character.toUpperCase(wort.charAt(0)));
			
			System.out.println(wort+" "+noun[number2]+" "+verb[number3]+" "+preposition[number4]+" "+article[number5]+" "+noun[number6]+".");
		}
		
	}

}
