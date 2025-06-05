// Box Class with out constructor
class Box
{
	double height;
	double width;
	double depth;
}

class BoxDemo
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.height = 10;
		b1.width = 15;
		b1.depth = 30;
		
		double vol;
		
		vol = b1.height*b1.width*b1.depth;
		System.out.println("Volume is : " + vol);

		Box b2 = new Box();
		b2.height = 3;
		b2.width = 6;
		b2.depth = 9;

		vol = b2.height*b2.width*b2.depth;
		System.out.println("Volume is : " + vol);
	}
}
