class Overload
{
	public void add(int x, int y)
	{
		System.out.println("Addition of "+ x + " and "+y+" is "+(x+y));
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of "+ a +","+ b +" and "+ c +" is "+(a+b+c));	
	}
}
public class P3Q2
{
	public static void main(String args[])
	{
		Overload o1 = new Overload();
		o1.add(5,5);
		o1.add(5,5,5);
	}
}
