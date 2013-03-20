package uebungen1;
class RectangleArea
{
	public static void main(String[] args)
	{
			int xa = Integer.parseInt(args[0]);
			int ya = Integer.parseInt(args[1]);
			int xb = Integer.parseInt(args[2]);
			int yb = Integer.parseInt(args[3]);
		
			int laenge = xb-xa;
			int hoehe = yb-ya;
			
			int flaeche = laenge*hoehe;
			flaeche = Math.abs(flaeche); //Betrag 
			//System.out.println(laenge);
			//System.out.println(hoehe);	
			System.out.println(flaeche);
	}
}