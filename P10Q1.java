
import java.util.*;

class NoMatchFound extends Exception
{
	public NoMatchFound(String msg)
	{
		super(msg);
	}
}

public class P10Q1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		try
		{
			String className;
			System.out.print("\n\t Enter your class name :");
			className = scan.next();

			if(className.equals("SYBSC"))
			{
				System.out.println("\n\t Class Name = " + className);
			}
			else
			{
				throw new NoMatchFound("Please Enter valid class Name");
			}
		}
		catch(NoMatchFound e)
		{
			System.out.println("\n\t Error = " + e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("\n\t Error = " + e);
		}
	}
}
