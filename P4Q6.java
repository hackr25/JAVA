
class staff
{
	int staffno;
	String name;
	double sal;
	staff(int sn, String n , double s)
	{
		staffno=sn;
		name=n;
		sal=s;
	}
	public void displaystaff()
	{
		System.out.println("Staff-no :"+staffno);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+sal);
	}
}
class teach_staff extends staff
{
	String sub;
	teach_staff(int sn , String n , double s , String sub)
	{
		super(sn,n,s);
		this.sub=sub;
	}
	public void displayts()
	{
		System.out.println("Subject :"+sub);
	}
}
class teach_ns extends staff
{
	String post;
	teach_ns(int sn , String n , double s , String p)
	{
		super(sn,n,s);
		post=p;
	}
	public void displaytns()
	{
		System.out.println("Post :"+post);
	}
}
public class  P4Q6
{
	public static void main(String[] args) 
	{
		teach_staff t1= new teach_staff(101,"pp",40000,"java");
		teach_ns t2= new teach_ns(102,"abc",20000,"clerk");
		t1.displaystaff();
		t1.displayts();
		System.out.println("\n");
		t2.displaystaff();
		t2.displaytns();
	}
}
