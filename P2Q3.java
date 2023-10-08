import java.util.Scanner;
class Detail
{ 
	public int Empno, ContactNo;
	public String Name, Department;
	public void EmpInfo()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Employee Number = ");
		Empno=s1.nextInt();
		System.out.println("Enter the Name = ");
		Name=s1.next();
		System.out.println("Enter the Contact Number = ");
		ContactNo=s1.nextInt();
		System.out.println("Enter the Department = ");
		Department=s1.next();
	}
	public void EmpData()
	{
		System.out.println("The Employee Number is " +Empno);
		System.out.println("The Employee Name is " +Name);
		System.out.println("The Contact Number is "+ContactNo);
		System.out.println("The Department is " +Department);
	}
}
public class P2Q3
{
	public static void main(String[] args)
	{
		Detail d1 = new Detail();
		d1.EmpInfo();
		d1.EmpData();
	}
}
