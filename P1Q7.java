import java.util.Scanner;
public class P1Q7 
{
	public static void main(String[] args) 
{
Scanner s1 = new Scanner(System.in);
System.out.println("Enter amount:");
float p= s1.nextFloat();
System.out.println("Enter Time:");
int t=s1.nextInt();
System.out.println("Enter Rate:");
int r= s1.nextInt();
double s= (p*t*r)/100;
System.out.println("Simple Interest:"+s);
}
}
