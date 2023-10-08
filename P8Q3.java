
import java.util.*;
public class P8Q3
{
	public static void main(String []args)
	{
		Vector Vec1 = new Vector();
		Vec1.add(100);
		Vec1.add("SYCS");
		Vec1.add(98.96);
		Vec1.add(153);
		Vec1.add("MCC");
		Vec1.add(100.53);
		Vec1.add(40700);
		Vec1.add("GAURAV");
		Vec1.add(573.88);
		Vec1.add("O");

	for(Object obj:Vec1)
	{
	//Printing Elements in Vector
		System.out.println("Element in Vector is "+obj);
	}
	{
//Checking Size of Arry
	System.out.println("Size of An Vector is "+Vec1.size());
	}
	{
//Get Method
	System.out.println("Element At 4th Index "+Vec1.get(4));
	}
	{	
//Contain()
boolean b1 = Vec1.contains("MCC");
if(b1)
System.out.println("Vector is Contain The Element");
else
System.out.println("Vector is Not Contain The Element");
	}
	{
//Remove()
System.out.println("Remove The Element "+Vec1.remove("MCC"));
System.out.println("Remove The Element "+Vec1.remove(3));
	}
}
}

