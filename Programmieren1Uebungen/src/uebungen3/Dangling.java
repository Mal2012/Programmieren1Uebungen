package uebungen3;

public class Dangling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,x;
		
		System.out.println("a) ");
		x=5;
		y=8;
		if ( y == 8 ){ 
			if ( x == 5 )  {
			System.out.println( "@@@@@");  
			}else{  
			System.out.println( "#####");  
			}
			System.out.println( "$$$$$");  
			System.out.println( "&&&&&");
		}
		
		System.out.println("b) ");
		x=5;
		y=8;
		if ( y == 8 ){ 
			if ( x == 5 )  {
			System.out.println( "@@@@@");  
			}else{  
			System.out.println( "#####");  
			
			System.out.println( "$$$$$");  
			System.out.println( "&&&&&");
			}
		}
		
		System.out.println("c) ");
		x=5;
		y=8;
		if ( y == 8 ){ 
			if ( x == 5 )  {
			System.out.println( "@@@@@");  
			}else{  
			System.out.println( "#####");  
			System.out.println( "$$$$$");  
			}
			System.out.println( "&&&&&");
		}
		
		System.out.println("d) ");
		x=5;
		y=7;
		if ( y == 8 ){ 
			if ( x == 5 )  {
			System.out.println( "@@@@@");  
			}}else{  
			System.out.println( "#####");  
			}
			System.out.println( "$$$$$");  
			System.out.println( "&&&&&");
		
	}

}
