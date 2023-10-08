
class Parent 
{
	public void get1()
	{
	System.out.println("This is super class");
	}
}

class Child extends Parent
{
	public void get2()
	{
	System.out.println("This is Sub or Derived class");
	}
}

class P4Q1
{
	public static void main(String [] args)
	{
	Child c=new Child();
	c.get1();
	c.get2();
	}
}

