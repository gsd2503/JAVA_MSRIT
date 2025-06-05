// Program for Throws keyword

class ThrowsDemo
{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throwOne");

		throw new IllegalAccessException(" AOT ");
	}

	public static void main(String args[])
	{
		try
		{
			throwOne();
		}

		catch(IllegalAccessException e)
		{
			System.out.println("Caught The Exception >> " + e);
		}

		finally
		{
			System.out.println("At The END of The Program.");
		}
	}
}
