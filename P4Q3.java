
class Person 
{
String name;
int age;
long P_no;
	public void getPerson(String n, int a, long pn)
	{
	name = n;
	age = a;
	P_no = pn;
	System.out.println("The Name of Person is "+name);
	System.out.println("The Age of Person is "+age);
	System.out.println("The Phone Number of Person is "+P_no);	
	}
}

class Employee extends Person
{
	public void getEmployee()
	{
	System.out.println("The Name of Employee is "+name);
	System.out.println("The Phone Number of Person is "+P_no);
	}
}

class Manager extends Employee
{
String designation;
String department;
int basic_sal;
	public void getManager(String des, String dept, int sal)
	{
	designation = des;
	department = dept;
	basic_sal = sal;
	System.out.println("The Designation of Employee is "+designation);
	System.out.println("The Department of Manager is "+department);
	System.out.println("The Salary of Manager is "+basic_sal);
	}
}

class P4Q3
{
	public static void main(String [] args)
	{
	Manager m = new Manager();
	m.getPerson("Sahil",18,9867952577);
	m.getEmployee();
	m.getManager("Manager","CS",50000);
	}
}
