package uebungen2;

import java.util.Scanner;

public class LogicalExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		boolean result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte a eingeben: ");
		a = sc.nextInt();
		System.out.println("Bitte b eingeben: ");
		b = sc.nextInt();
		System.out.println("Bitte c eingeben: ");
		c = sc.nextInt();
		System.out.println("Bitte d eingeben: ");
		d = sc.nextInt();
		/*
		 * if(a>1 || b>1 || c>1 || d>1) result = true; else result = false;
		 * 
		 * System.out.println("Aussage 1: "+ result);
		 * 
		 * if((a>1)^(b>1)^(c>1)^(d>1)&& !((a>1) && (b>1) && (c>1) && (d>1)))
		 * result = true; else result = false;
		 * 
		 * System.out.println("Aussage 2: "+ result);
		 * 
		 * if(((a<0) && !((b<0)^(c<0)^(d<0)))^((b<0) &&!
		 * ((a<0)^(c<0)^(d<0)))^((c<0) &&!
		 * ((a<0)^(b<0)^(d<0)))^((d<0)&&!((a<0)^(b<0)^(c<0)))) result = true;
		 * else result = false; System.out.println("Aussage 3: "+ result);
		 * 
		 * if(!(((a>0 && a>10)^(b>0 && b>10)^(c>0 && c>10)^(d>0 && d>10))& ((a<0
		 * && a<10)^(b<0 && b<10)^(c<0 && c<10)^(d<0 && d<10)))) result = true;
		 * else result = false;
		 * 
		 * System.out.println("Aussage 4: "+ result);
		 */
		System.out.println("Eingabe");
		System.out
				.println("a	|	b	|	c	|	d	|	Aussage 1 |	Aussage 2 |	Aussage 3 |	Aussage 4");
		System.out
				.println("------------------------------------------------------------------------------------------");

		System.out.print(a + "	|	" + b + "	|	" + c + "	|	" + d + "	|	");

		if (a > 1 || b > 1 || c > 1 || d > 1)
			result = true;
		else
			result = false;

		System.out.print(result + " |");

		if ((a > 1) ^ (b > 1) ^ (c > 1) ^ (d > 1)
				&& !((a > 1) && (b > 1) && (c > 1) && (d > 1)))
			result = true;
		else
			result = false;

		System.out.print(" " + result + " |");

		if (((a < 0) && !((b < 0) ^ (c < 0) ^ (d < 0)))
				^ ((b < 0) && !((a < 0) ^ (c < 0) ^ (d < 0)))
				^ ((c < 0) && !((a < 0) ^ (b < 0) ^ (d < 0)))
				^ ((d < 0) && !((a < 0) ^ (b < 0) ^ (c < 0))))
			result = true;
		else
			result = false;
		System.out.print(" " + result + " |");

		if (!(((a > 0 && a > 10) ^ (b > 0 && b > 10) ^ (c > 0 && c > 10) ^ (d > 0 && d > 10)) & ((a < 0 && a < 10)
				^ (b < 0 && b < 10) ^ (c < 0 && c < 10) ^ (d < 0 && d < 10))))
			result = true;
		else
			result = false;

		System.out.print(" " + result);

	}

}
