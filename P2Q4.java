
import java.util.Scanner;
class Product
{ 
	int ProdId;
	String ProdName;
	int ProdPrice;
	int Quantity;
	int Total;
	public void getInfo()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Product ID : ");
		ProdId=s1.nextInt();
		System.out.println("Enter the Product name : ");
		ProdName=s1.next();
		System.out.println("Enter the Price of the product : ");
		ProdPrice=s1.nextInt();
		System.out.println("Enter the Quantity : ");
		Quantity=s1.nextInt();
	}
	public void showdata()
	{
		System.out.println("Id of the purchased product is " +ProdId);
		System.out.println("Name of Purchased product is " +ProdName);
		System.out.println("Price of the Purchased product is " +ProdPrice);
		System.out.println("Quantity of the Purchased product is " +Quantity);
	}
	public void bill()
	{
		Total=ProdPrice*Quantity;
		//showdata();
		System.out.println("Total amount of the product is " +Total);
	}
}
public class P2Q4
{
	public static void main(String[] args)
	{
		Product o1 = new Product();
		o1.getInfo();
		o1.showdata();
		o1.bill();
	}
}
