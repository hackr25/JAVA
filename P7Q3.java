
import java.util.*;
class student
{
	int RollNo;
	String Name;
	int Marks;

	public student(int rn, String n, int m)
	{
		RollNo = rn;
		Name = n;
		Marks = m;
	}

	public String toString()
	{
		return Name + "\t" + RollNo + "\t" + Marks;
	}
}
public class P7Q3
{
	public static void main(String []args)
	{
		ArrayList<student> list1 = new ArrayList<student>();
		student s1 = new student(101,"Yug",90);
		list1.add(s1);
		list1.add(new student(102,"Sahil",80));
		System.out.println("Elements in Array is "+list1);
	}
}

