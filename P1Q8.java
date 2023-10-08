import java.util.Scanner;
public class P1Q8
{
public static void main(String[] args) 
{
Scanner s1= new Scanner(System.in);
System.out.println("Enter value of x & y:");
int x= s1.nextInt();
int y= s1.nextInt();
System.out.println("Before swap x="+x);
System.out.println("Before swap y="+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After Swap x="+x);
System.out.println("After Swap y="+y);
}
}
