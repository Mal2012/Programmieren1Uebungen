package uebungen6;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Triangle t = new Triangle(new Point(-1,0),new Point(0,2),new Point(1,0)); 
		 Point fg = new Point(5,2);
		 
		 System.out.println(t.a());
		System.out.println(t.b());
		System.out.println(t.c());
		
		// System.out.println();
		// System.out.println("Umfang: " + t.perimeter());
		 
		// System.out.println("Fläche: "+t.area());
		 
		 //System.out.println(fg);
		 //System.out.println(fg.movePoint(new Point (-1, +2)));
		 
		System.out.println();
		t=t.zoomed(new Point (0,1), -1);
		System.out.println(t.a());
		System.out.println(t.b());
		System.out.println(t.c());
		System.out.println();
		t=t.move(new Point (0,-1));
		System.out.println(t.a());
		System.out.println(t.b());
		System.out.println(t.c());
		System.out.println();
		System.out.println(t.lowerLeft());
		System.out.println(t.upperRight());
	}

}
