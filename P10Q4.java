
import java.util.*;

class MinimumBalance extends Exception
{
	public MinimumBalance(String msg)
	{
		super(msg);
	}
}
class InsufficientBalance extends Exception
{
	public InsufficientBalance(String msg)
	{
		super(msg);
	}
}
class Account
{  String name;
   double iniBal;
	public Account(String n,double ib)
	{
		name = n;
		iniBal = ib;
	}
	public void show()
	{
		System.out.println( " Name :" +name);
		System.out.println("Balance :"+iniBal);
	}
}
public class P10Q4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		try
		{
			String Name;
			double bal,wd;
		System.out.print("\n\t Enter your  name :");
			Name = scan.next();
		System.out.print("\n\t Enter your  balance :");
			bal = scan.nextInt();
			if(bal > 500 )
			{
		System.out.print("\n\tEnter your withdraw ammount :");
			wd = scan.nextInt();
			if(wd < bal)
			{
				bal =bal-wd;	
			  Account ac1 = new Account(Name,bal)
				ac1.show();	
			}
			else
			{
	throw new InsufficientBalance("you dont have sufficient balance to withdraw");
			}
		}
			else
			{
	throw new MinimumBalance("you dont have minimum balance  in your account");
			}
		}
		catch(MinimumBalance e)
		{
			System.out.println("\n\t Error = " + e.getMessage());
		}
		catch(InsufficientBalance e)
		{
			System.out.println("\n\t Error = " + e.getMessage());
		}
		
	}
}

