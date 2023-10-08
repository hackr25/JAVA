
class publication
{
	float Price;
	String title;
	publication(float Price, String title)
	{
		this.Price=Price;
		this.title=title;
	}
	public void displaypub()
	{
		System.out.println("Title.of a Book  "+title);
		System.out.println("price of a Book  "+Price);
	}
}
class Book extends publication
{
	int pg;
	Book(float p, String n , int pg)
	{
		super(p,n);
		this.pg=pg;
	}
	public void displayBook()
	{
		System.out.println("no.of page :"+pg);
	}
}
class CD extends publication
{
	float ptime;
	CD(float p, String n , float ptime)
	{
		super(p,n);
		this.ptime=ptime;
	}
	public void showCD()
	{
		System.out.println("PlayTime :"+ptime+" sec");
	}
}
public class P4Q5
{
	public static void main(String[] args) 
	{
		Book b1= new Book(100,"Python3",200);
		CD c1= new CD(100,"Python3", 400);
		b1.displaypub();
		b1.displayBook();
		c1.showCD();
	}
}
