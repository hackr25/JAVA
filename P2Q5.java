
import java.util.Scanner;
class Student
{
	String studName;
	int studId;
	int sub1, sub2, sub3;
	int total;
	double average;
	public void getInfo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		studName=s.next();
		System.out.println("Enter Student ID : ");
		studId=s.nextInt();
		System.out.println("Enter Marks of Subject 1 : ");
		sub1=s.nextInt();
		System.out.println("Enter Marks of Subject 2 : ");
		sub2=s.nextInt();
		System.out.println("Enter Marks of Subject 3 : ");
		sub3=s.nextInt();
	}
	public void showInfo()
	{
		System.out.println("Name of Student is : " +studName);
		System.out.println("Id of the Student is : " +studId);
		System.out.println("Marks Scored in Subject 1 : "+sub1);
		System.out.println("Marks Scored in Subject 2 : "+sub2);
		System.out.println("Marks Scored in Subject 3 : "+sub3);
	}
	public void average()
	{
		total=sub1+sub2+sub3;
		average=(double)total/3;
		//showInfo();
		System.out.println("Average Marks of the Student is : " +average);
	}
	public void res()
	{
		if(average>80)
		{ 
			System.out.println("Result is O Grade");
		}
		if(80>average && average>70)
		{ 
			System.out.println("Result is A Grade");
		}
		if(70>average && average>60)
		{
			 System.out.println("Result is B Grade");
		}
		if(60>average && average>40)
		{ 
			System.out.println("Result is C Grade");
		}
		if(average<40)
		{ 
			System.out.println("Result is Failed");
		}

	}
}
public class P2Q5
{
	public static void main(String[] args)
	{
		Student o1=new Student();
		o1.getInfo();
		o1.showInfo();
		o1.average();
		o1.res();
	}
}
