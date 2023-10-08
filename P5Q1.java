
interface Animal
{
	public void eat();
	public void move();
}
class cat implements Animal
{
	public void eat()
	{
		System.out.println("eating.....!!");
	}
	public void move()
	{
		System.out.println("moving......!!");
	}
}
class dog implements Animal
{
	public void eat()
	{
		System.out.println("(dog) eating....!!");
	}
	public void move()
	{
		System.out.println("(dog) moving......!!");
	}
}
public class P5Q1
{
public static void main(String[] args) 
{
cat c1 = new cat();
dog d1 = new dog();
c1.eat();
c1.move();
d1.eat();
d1.move();
}
}


