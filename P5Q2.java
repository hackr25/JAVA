
interface function
{
	public int evaluate(int n);
}

class Half implements function
{
	public int evaluate(int n)
	{
	int a = (n/2);
	System.out.println("Half Value is "+a);
	return a;
	}
}

class Double implements function
{
	public int evaluate(int n)
	{
	int b = (n*2);
	System.out.println("Multiplication Value is "+b);
	return b;
	}
}

public class P5Q2
{
	public static void main(String []args)
	{
		Half h = new Half();
		Double d = new Double();
		h.evaluate(2);
		d.evaluate(2);
	}
}
