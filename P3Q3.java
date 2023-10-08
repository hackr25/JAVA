class Overload_Flr
{
	String flower;
	int num;
	public void Show_Flr()
	{
		System.out.println("Rose is beautiful flower");
	}
	public void Show_Flr(String flower)
	{
		System.out.println(flower+ " is beautiful flower");
		System.out.println(flower+ " is beautiful flower");
	}
	public void Show_Flr(String flower, int num)
	{
		for(int i=1; i<=num; i++)
		{
		System.out.println(flower+ " is beautiful flower");
		}
	}
}

public class P3Q3
{
	public static void main(String args[])
	{
            	Overload_Flr o1 = new Overload_Flr();
		o1.Show_Flr();
		o1.Show_Flr("Sunflower");
		o1.Show_Flr("Marigold",3);
	}
}
