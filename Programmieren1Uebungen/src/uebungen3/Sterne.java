package uebungen3;

public class Sterne {
	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++)
		{
			for(int ib =1; ib<= i; ib++)
				System.out.print("*");
			System.out.println();
		}

		
		for(int i=10; i>=0; i--)
		{
			for(int ib =1; ib<= i; ib++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=10; i>=0; i--)
		{
			for(int ic=10; ic>=i; ic--)
					System.out.print(" ");
			for(int ib =1; ib<= i; ib++){
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=1; i<=10; i++)
		{
			for(int ic=10; ic>=i; ic--)
					System.out.print(" ");
			for(int ib =1; ib<= i; ib++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
