package uebungen5;
import java.util.Scanner;


public class PrimTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte Obergrenze eingeben: ");
		int grenze = sc.nextInt();
		
		for(int i=1; i<=grenze; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
	}
	public static boolean isPrime(long n) {
		boolean prime = true;
			for (long i = 3; i <= Math.sqrt(n); i += 2)
				if (n % i == 0) {
					prime = false;
					break;
				}

			if (( n%2 !=0 && prime && n > 2) || n == 2) {
				return true;
			} else {
				return false;
			}

		}

}
