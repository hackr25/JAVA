
class Person 
{
	public void getPerson(String name, int age)
	{
	System.out.println("The Name of Person is "+name);
	System.out.println("The Age of Person is "+age);	
	}
}

class Employee extends Person
{
	public void getEmployee(int exp, int salary)
	{
	System.out.println("The Experience of Employee is "+exp+ " Years");
	System.out.println("The Experience of Employee is "+salary);
	}
}

class Manager extends Employee
{

	public void getManager(String Post)
	{
	System.out.println("The Post of Employee is "+Post);
	}
}

class P4Q2
{
	public static void main(String [] args)
	{
	Manager m = new Manager();
	m.getPerson("Sahil",18);
	m.getEmployee(2,50000);
	m.getManager("Manager");
	}
}
