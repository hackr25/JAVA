class AreaOver
{
	int l,b,h;
	public void Display(int l)
	{
		System.out.println("Area of Square is = "+l*l);
	}
	public void Display(int l, int b, int h)
	{
		System.out.println("Area of Rectangle is = "+(l*b*h));
	}
}
public class P3Q5
{
	public static void main(String args[])
	{
		AreaOver a1 = new AreaOver();
		a1.Display(10);
		a1.Display(10,10,10);
	}
}
