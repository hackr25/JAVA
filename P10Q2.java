
import java.util.*;

class LengthMismatch extends Exception
{
	public LengthMismatch(String msg)
	{
		super(msg);
	}
}

public class P10Q2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		try
		{
			String str1;
			System.out.print("\n\t Enter your class name :");
			str1 = scan.next();

			if(str1.length() ==5)
			{
				throw new LengthMismatch("Please Enter valid class Name");
			}
			else
			{
				System.out.println("\n\t Strin is = " + str1);
			}
		}
		
		catch(LengthMismatch e)
		{
			System.out.println("\n\t Error = " + e);
		}
	}
}

