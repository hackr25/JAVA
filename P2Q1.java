
import java.util.Scanner;
class Box
{ 
	public int l, b, h;
	public int side;
	public void getdisplay()
	{
		System.out.println("Enter the length, breadth, height and side : ");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		side=sc.nextInt();
		System.out.println("Length of Box : " +l);
		System.out.println("Breadth of Box : " +b);
		System.out.println("Height of Box : " +h);
		System.out.println("Side of Box : " +side);
	}
	public void getVolume()
	{
		System.out.println("Volume of Box : " +l*b*h);
	}
	public void getSquare()
	{
		System.out.println("Area of square : " +side*side);
	}
}
public class P2Q1
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.getdisplay();
		b1.getVolume();
		b1.getSquare();
	}
}
