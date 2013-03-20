package uebungen3;

public class IFFragen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9,y=11;
		System.out.println("Fall x=9, y=11");
		System.out.println("a) \n");
		if (x < 10) 
			  if (y > 10) 
			  System.out.println("*****"); 
			  else 
			  System.out.println("######"); 
			  System.out.println("$$$$$$");
			  
			  System.out.println("b) \n");
			  if (x < 10) { 
				 if (y > 10) 
				 System.out.println("*****"); 
				 } 
				 else { 
				 System.out.println("######");
				 System.out.println("$$$$$$"); 
				  } 
				 
				 x=11;
			  y=9;
			  System.out.println("\nFall x=11, y=9");
			  System.out.println("a) \n");
			  if (x < 10) 
					  if (y > 10) 
					  System.out.println("*****"); 
					  else 
					  System.out.println("######"); 
					  System.out.println("$$$$$$");
					  
					  
			  System.out.println("b) \n");

			  if (x < 10) { 
				  if (y > 10) 
				  System.out.println("*****"); 
				  } 
				  else { 
				  System.out.println("######"); 
				  System.out.println("$$$$$$"); 
				  } 
		}

}
