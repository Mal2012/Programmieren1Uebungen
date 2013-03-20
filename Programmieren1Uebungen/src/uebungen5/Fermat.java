package uebungen5;
public class Fermat {
	public static void main(String[] args) {

		System.out.println(fermatTest(999983, 17));
		System.out.println(fermatTest(999984, 17));
/*
		System.out.println(isPrime(999983));
		System.out.println(isPrime(999984));
		*/
		System.out.println(randomPrime());
System.out.println(isPrime(1882738794));
	}

	static boolean fermatTest(int n, int a) {
		boolean result = false;
		if (pow(a, (n - 1), n) % n == 1)
			result = true;

		return result;
	}

	public static int pow(final int a, int k, final int b) {
		long x = a;
		long z = 1;
		while (k > 0)
			if (k % 2 == 0) {
				k /= 2;
				x = x * x % b;
			} else {
				k--;
				z = z * x % b;
			}
		return (int) z;
	}

	public static boolean isPrime(int n) {
		int a = 0;
		for (int i = 0; i < 100; i++) {
			a = (int) (Math.random() * (n - 1)) + 1;
			if (fermatTest(n, a))
				return true;
		}
		return false;
	}

	public static int randomPrime(){
	int n;
	do 
		n=(int) (Math.random()*(Integer.MAX_VALUE));
	while(!isPrime(n));
	return n;
	
	}
}
