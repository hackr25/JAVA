import java.util.Scanner;
public class P1Q2
{
public static void main(String [] args)
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter Number");
	int num1 = s1.nextInt();
	int num2 = s1.nextInt();
System.out.println("Addition:" +(num1+num2));
System.out.println("subtraction:" +(num1-num2));
System.out.println("Divsion:" +(num1/num2));
System.out.println("Multiplication:" +(num1*num2));
}
}
