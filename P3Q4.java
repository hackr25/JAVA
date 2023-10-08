class Interest
{
	double p,r,n;
	public void IntCal()
	{
		System.out.println("\nP = Principal \nR = Rate of interest \nN =No of Years");
	}
	public void IntCal(double p, double r)
	{
		System.out.println("Simple Interest = "+((p*r*1)/100));
	}
	public void IntCal(double p, double r, double n)
	{
		System.out.println("Compound Interest = "+(p*(1+r/100*n)-p));
	}
}
public class P3Q4
{
	public static void main(String args[])
	{
		Interest i1 = new Interest();
		i1.IntCal(1000,2);
		i1.IntCal(4000,3,2);
	}
}
