import java.util.Scanner;
class TelephoneBill
{ 
	private long tel_no,no_of_calls;
	Scanner sc=new Scanner(System.in);
	
	public void getInfo()
	{
		System.out.println("Enter your Telephone No. & No. of calls made in a month ");
		tel_no = sc.nextLong();
		no_of_calls = sc.nextInt();
	}
	public void displayBill()
	{
		if(no_of_calls>150)
		{
			System.out.println("The Billing amount is " + (400+(no_of_calls - 150)*0.8) + "Rs");
		}
		else
		{
			System.out.println("The Billing amount is 400");
		}
	}
}
public class P2Q7
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		TelephoneBill t1 = new TelephoneBill();
		t1.getInfo();
		t1.displayBill();
	}
}

