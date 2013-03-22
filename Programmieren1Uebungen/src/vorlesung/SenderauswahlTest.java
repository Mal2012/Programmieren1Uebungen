package vorlesung;

public class SenderauswahlTest {

	public static void main(String[] args) {
		Senderauswahl s = new Senderauswahl(0);
		System.out.println(s);
	
		s.speicherSendername(5, "Penis");

		
		System.out.println(s.sucheSender("Penis"));	
		while(true){
		s.Zapping();
		System.out.println(s);
		}
		
	}

}
