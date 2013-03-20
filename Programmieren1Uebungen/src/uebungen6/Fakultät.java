package uebungen6;

public class Fakultät {

	public static void main(String[] args) {

		System.out.println(fak(30));
	}
	
	public static int fak(int n){
		if(n<=1){
			return n;
		}else{
			return n * fak(n-1);
		}
		
		
		
	}

}
