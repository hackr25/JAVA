
import java.util.*;
public class P7Q1
{
	public static void main(String []args)
	{
		ArrayList Arr1 = new ArrayList();
		Arr1.add(100);
		Arr1.add("SYCS");
		Arr1.add(98.96);
		Arr1.add(153);
		Arr1.add("MCC");
		Arr1.add(100.53);
		Arr1.add(40700);
		Arr1.add("GAURAV");
		Arr1.add(573.88);
		Arr1.add("O");

	for(Object obj:Arr1)
	{
	//Printing Elements in Array
		System.out.println("Element in Array is "+obj);
	}
	{
//Checking Size of Arry
	System.out.println("Size of An Array is "+Arr1.size());
	}
	{
//Get Method
	System.out.println("Element At 4th Index "+Arr1.get(4));
	}
	{	
//Contain()
boolean b1 = Arr1.contains("MCC");
if(b1)
System.out.println("Array is Contain The Element");
else
System.out.println("Array is Not Contain The Element");
	}
	{
//Remove()
System.out.println("Remove The Element "+Arr1.remove("MCC"));
System.out.println("Remove The Element "+Arr1.remove(3));
	}
}
}

