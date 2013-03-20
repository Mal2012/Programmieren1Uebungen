package uebungen6;

public class quadtest {

	public static void main(String[] args) {
		
		 int[][] a1 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,0},{2,2,2,2}}; 
		   int[][] a2 = { {2,2,2,2}, {2,2,2,2}, {2,2,2,2},{2,2,2,2}}; 
		   int[][] a3 = { {2,7,6}, {9,5,1}, {4,3,8,}}; 
		   int[][] a4 = { {2,3,3,4}, {2,2,5,2}, {5,7,2,2},{4,7,9,2}}; 
		   int[][] a5 = { {1,3,3,1}, {3,2,2,2}, {5,3,3,2},{4,7,9,4}};
		   
		Quadrat nq = new Quadrat(a5);

		Quadrat b = nq.erzeugeMagicQuadrat(9);
		b.print();
		System.out.println(b.isMagic());
	}

}
