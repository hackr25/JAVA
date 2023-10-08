
import java.util.*;

class MarksOutOfBound extends Exception
{
	public MarksOutOfBound(String msg)
	{
		super(msg);
	}
}
class Student
{  String name;
   int rollNo,m1,m2,m3;
	public Student(String n,int rn,int m1,int m2, int m3)
	{
		name = n;
		rollNo = rn;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void show()
	{
		System.out.println( " Name :" +name);
		System.out.println("roll number :"+rollNo);
		System.out.println("Marks in subject 1:" +m1);
		System.out.println("Marks in subject 2:" +m2);
		System.out.println("Marks in subject 3:" +m3);
		
	}


}

public class P10Q3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		try
		{
			String Name;
			int rn,m1,m2,m3;
			System.out.print("\n\t Enter your  name :");
			Name = scan.next();
			System.out.print("\n\t Enter your  roll no. :");
			rn = scan.nextInt();
			System.out.print("\n\t Enter your  marks in 1st subject :");
			m1 = scan.nextInt(); 
			System.out.print("\n\t Enter your  marks in 2nd subject :");
			m2 = scan.nextInt(); 
			System.out.print("\n\t Enter your  marks in 3rd subject :");
			m3 = scan.nextInt(); 
			
			if(m1<=100 && m2 <=100 && m3 <=100 )
			{
			  Student st1 = new Student(Name,rn,m1,m2,m3);
				st1.show();	
			}
			else
			{
				throw new MarksOutOfBound("Please Enter valid marks");
			}
		}
		catch(MarksOutOfBound e)
		{
			System.out.println("\n\t Error = " + e.getMessage());
		}
		
	}
}


