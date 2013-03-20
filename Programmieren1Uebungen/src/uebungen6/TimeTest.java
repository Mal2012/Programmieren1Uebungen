package uebungen6;

public class TimeTest {



   public static void main(String[] args)
   {
      Time time1 = new Time(11,59,50);
      Time time2 = new Time(time1);
      Time time3 = new Time();


      
  //  System.out.println("Time1: " + time1.toString());
    //time1.tick();
    //System.out.println("Time1: " + time1.toString());
      //System.out.println("Time2: " + time2.toString());
    //  System.out.println("Time2: " + time2.toString());
      
      
      
      while(true){
    	System.out.print("\n\n\n\n\n\n\n\n\n");
    	  time1.tick();
    	  System.out.print(time1.toString()); 
    	 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

      }
   }

}  // end class TimeTest

