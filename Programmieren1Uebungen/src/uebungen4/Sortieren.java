package uebungen4;
import java.util.Arrays;

public class Sortieren {

	public static void main(String[] args) {
		int array[] = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 999, 0,
				666, 2345, 7492, 22 };

		System.out.println("Data items in original order:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		Arrays.sort(array);
		
		System.out.println("\n Data items in ascending order:");
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}
		

	}

}
