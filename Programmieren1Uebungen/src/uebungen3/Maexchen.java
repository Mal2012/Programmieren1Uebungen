package uebungen3;

import java.util.Scanner;
public class Maexchen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte 1.Würfelzahl eingeben");
		int x1 = sc.nextInt();
		System.out.println("Bitte 2.Würfelzahl eingeben");
		int x2 = sc.nextInt();
		int result=0;
		if(x1==1&&x2==2||x1==2&&x2==1){
			result = 1000;
		}else{
			if(x1==x2)
				result = x1*100;
		
			if(x1<x2)
				result=x2*10+x1;
			else
				if(x1!=x2)
					result=x1*10+x2;
		}
	System.out.println(result);
	}

}
