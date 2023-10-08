import java.util.Scanner;
class Bank
{
	int ac_no;
	String name_of_ac_holder;
	String type_of_ac;
	int bal_amt;
	int x,y,z;
	public void show()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Account Number : ");
		ac_no=s.nextInt();
		System.out.println("Enter Your Name : ");
		name_of_ac_holder=s.next();
		System.out.println("Enter The Type Of Account : ");
		type_of_ac=s.next();
	}
	public void Depo()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Present Balance In Your  Account : ");
		bal_amt=s.nextInt();
		System.out.println("Enter The Amount To Be Deposited : ");
		x=s.nextInt();
		z=x+bal_amt;
		System.out.println("Your Balance Account After Depositing : " +z);
	}
	public void Withd()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Amount To be WithDrawn : ");
		y=s.nextInt();
		System.out.println("Your Balance Amount After WithDrawn : " +(z-y));
	}
}
public class P2Q2
{ 
	public static void main(String[] args)
	{
		Bank o1=new Bank();
		o1.show();
		o1.Depo();
		o1.Withd();
	}
}
