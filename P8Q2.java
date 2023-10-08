
import java.util.*;
public class P8Q2
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
		System.out.println("Element in Stack is "+obj);
	}
	}
}
