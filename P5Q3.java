
interface Shape
{
	public void area(int d1, int d2);
}

class Rectangle implements Shape
{
	public void area(int l, int b)
	{	
		System.out.println("Area of Rectangle is "+ l*b);
	}
}

class Triangle implements Shape
{
	public void area(int b, int h)
	{	
		System.out.println("Area of Triangle is "+ (b*h)/2);
	}
}

public class P5Q3
{
	public static void main(String []args)
	{
		Rectangle h = new Rectangle();
		Triangle d = new Triangle();
		h.area(2,2);
		d.area(2,2);
	}
}

