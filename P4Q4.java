
 class Shape
{
double radius;
int length;
int breath;
int height;
}

class Rectangle extends Shape
{
	public void GetRec(int length, int breath)
	{
	System.out.println("The Length of Rectangle "+length);
	System.out.println("The breath of Rectangle "+breath);
	}
}
class Triangle extends Shape
{
	public void GetTri(int length, int breath, int height)
	{
	System.out.println("The Length of Triangle "+length);
	System.out.println("The breath of Triangle "+breath);
	System.out.println("The height of Triangle "+height);
	}
}
class Circle extends Shape
{
	public void GetCir(double radius)
	{
	System.out.println("The Radius of Circle "+radius);
	}
}

public class P4Q4
{
	public static void main(String [] args)
	{
	Rectangle r = new Rectangle();
	Triangle t = new Triangle();
	Circle c = new Circle();
	r.GetRec(10,20);
	t.GetTri(11,22,33);
	c.GetCir(5.2);
	}

}
