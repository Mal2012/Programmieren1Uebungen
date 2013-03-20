package uebungen3;

public class Ausgabe {

	public static void main(String[] args) {
		System.out.println("Mystery1"); 
		
		int y, x = 1, total = 0; 
         while ( x <= 10 ) { 
               y = x * x ; 
              System.out.println( y ); 
               total += y; 
              ++x; 
        } 
         
         System.out.println("Mystery 2");
         
         int count = 1; 
         while ( count <= 10 ) { 
             System.out.println(  
             count %2 == 1 ? "*****" : "++++++"); 
             ++count; 
        } 
		
         
        System.out.println("Mystery 3");
        int row = 10, column; 
        while ( row  >= 1 ) { 
          column = 1; 
          while ( column <= 10 ) { 
            System.out.print(  row % 2 == 1 ? "<" : ">"); 
            ++column; 
          } 
        -- row; 
                       } 
        System.out.println( ); 
	}

}
