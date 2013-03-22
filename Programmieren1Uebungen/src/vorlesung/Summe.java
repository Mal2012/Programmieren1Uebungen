package vorlesung;
public class Summe {

	static int berechne(int n) {
		return (n*(n+1)*(2*n+1))/6;
	}
	static int berechne2(int n){
		int summe = 0;
		for(int i=0; i<=n; i++){
			summe += (i*i);
		}
		return summe;
	}
	static int berechne3(int n){
		if(n>0){
			return berechne3(n-1) +  n*n;
		}else{
		return 0;
		}
	}
	
	public static void main(String[] args){
		System.out.println(berechne(20));
		System.out.println(berechne2(20));
		System.out.println(berechne3(20));
		int i = 65;
		char c = 'z';
		i=c;
		System.out.println(i);
		
	}
}
