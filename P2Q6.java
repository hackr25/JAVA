
import java.util.Scanner;
class Complex {
	int real;
	int img;
	Complex() 
	{
		real=0;
		img=0;
	}
	Complex(int r, int i)
	{
		real = r;
		img= i;
	}
	public Complex addZ(Complex c1, Complex c2)
	{
		Complex sum = new Complex();
		sum.real = c1.real + c2.real;
		sum.img = c1.img + c2.img;
		return sum;
	}
	public Complex subZ(Complex c1, Complex c2)
	{
		Complex sub = new Complex();
		sub.real = c1.real - c2.real;
		sub.img = c1.img - c2.img;
		return sub;
	}
   public void displayadd()
   {
   	System.out.println("Addition of complex number : "+ real + " + "+ img +"i");
   }
   public void displaysub()
   {
   	System.out.println("Subtraction of complex number : "+ real + " - "+ img+"i");
   }
  
}
public class P2Q6
 {
	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter complex 1:");
		int a= s1.nextInt();
		int b= s1.nextInt();
		System.out.println("Enter complex 2:");
		int x=s1.nextInt();
		int y=s1.nextInt();
		Complex c1 = new Complex(a, b);
		Complex c2 = new Complex(x, y);
		Complex c3 = new Complex();
		Complex c4= new Complex();
		c3 = c3.addZ(c1, c2);
		c4 = c4.subZ(c1,c2);
		c3.displayadd();
		c4.displaysub();
	}
}
