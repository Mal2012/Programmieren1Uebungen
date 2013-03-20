class power
{
	public static void main(String[] args)
	{
	 int number = Integer.parseInt(args[0]);
	 int counter = 1;
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