package uebungen3;

public class Dreiecke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1, c=1;
		
		for(a=1; a<=500; a++){
			for(b=1; b<=500; b++){
				for(c=1; c<=500; c++){
					int d=(int) (Math.pow(a, 2)+Math.pow(b, 2));
					if(Math.pow(c, 2)==d){
						System.out.println("a: "+a+" b: "+b+" c: "+c);
					}
					
				}
			}
		}
		
		
	}

}
