package uebungen6;
public class sum{

	public static void main(String[] args){
		System.out.println(summe(5));
		
	}


public static int summe(int n){
	if(n<=1){
		return n;
	}else{
		return n+ summe(n-1);
	}
}
}