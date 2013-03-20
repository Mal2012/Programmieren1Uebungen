package uebungen1;
import java.util.Scanner;
class power2
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 int number;
	 int counter = 1;
	 System.out.print("Bitte Zahl eingeben: ");
	 number = sc.nextInt();
	 System.out.printf("\nEingelesener Wert war %d\n\n", number);
	 System.out.print("Zahl	Quadrat	Kubisch\n");
	 System.out.print("=======================\n");
	 while(counter <= number)
		{
		 System.out.printf("%d	%d	%d\n", counter, counter*counter, counter*counter*counter);
		/*
		 System.out.printf("%d    ", counter);
		 System.out.printf("%d    ", counter*counter);
		 System.out.printf("%d    \n", counter*counter*counter);
		 */
		 counter = counter +1;
		}
	}
}