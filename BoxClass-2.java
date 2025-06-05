// Box Class with non parameterised constructor

class Box
{
	double height;
	double width;
	double depth;

	Box()
	{
		height = 100;
		width = 150;
		depth = 200;
	}

	double vol()
	{
		return height*width*depth;
	}
}

class BoxDemo
{
	public static void main(String[] args)
	{
		Box b = new Box();
		System.out.println("Volume is : " + b.vol());
	}
}
