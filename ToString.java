// Cpnverting number to strings and returning it

class Box
{
	double height, width, depth;

	Box(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	public String toString()
	{
		return "The Dimensions Are: " + height + " " + width + " " + depth;
	}
}

class toStringDemo
{
	public static void main(String args[])
	{
		Box B = new Box(10,12,14);

		String S1 = "New S1 is " + B;

		System.out.println(B);
		System.out.println(S1);

		String S2 = "MSRIT";

		int start = 1;
		int end = 4;

		char buf[] = new char[end-start];
		S2.getChars(start,end,buf,0);

		System.out.println(buf);
		System.out.println("The No of Args: " + args.length);

		for(int i=0; i<args.length; i++)
		{
			System.out.println("The Argument " + i + " " + args[i]);
		}
	}
}
