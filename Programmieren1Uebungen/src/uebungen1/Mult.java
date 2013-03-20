package uebungen1;
class Mult
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		int counter = 3;
		int result = 1;

		if(number >= counter)
		{
			//System.out.print("if true");
			while(counter <= number)
			{
			 result = result*counter;
			 counter = counter+1;
			}
		}else
			{
			 result = 1;
			}
		System.out.print(result);
	}
}