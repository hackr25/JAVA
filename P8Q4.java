
import java.util.*;
public class P8Q4
{
	public static void main(String []args)
	{
		Stack St1 = new Stack();
		St1.add(100);
		St1.add("SYCS");
		St1.add(98.96);
		St1.add(153);
		St1.add("MCC");
		St1.add(100.53);
		St1.add(40700);
		St1.add("GAURAV");
		St1.add(573.88);
		St1.add("O");

	for(Object obj:St1)
	{
		//Printing Elements in Stack
		System.out.println("Element in Stack is "+obj);
	}
	{
		//Checking the stack is empty or not 
		System.out.println("Stack is Empty or Not "+St1.empty());
	}
	{
		System.out.println("Search An Element "+St1.search("MCC"));
		//Remove()
		System.out.println("Remove The Element "+St1.pop());
	}
	}
}
