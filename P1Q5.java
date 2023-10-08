import java.util.Scanner;
public class P1Q5
{
public static double area(int x)
{
return 3.14*x*x;
}
public static double circum(int x)
{
return 2*3.14*x;
}
public static void main(String [] args)
{
Scanner s1 = new Scanner(System.in);
System.out.println("Enter Radius");
int r =s1.nextInt();
double x =area(r);
double y=circum(r);
System.out.println("Area of Circle:"+x);
System.out.println("Circumference of Circle:"+y);
}
}
