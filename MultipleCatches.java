// Program for Try Catch and Finally

class MultipleCatches
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			System.out.println("The Value of A is " + a);
 
			int b = 43/a;
			int c[] = {1};

			c[18] = 45;
		}

		catch(ArithmeticException e)
		{
			System.out.println("Division By ZERO >> " + e);
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound >> " + e);
		}

		System.out.println("Out of The Try Block.");
	}
}
