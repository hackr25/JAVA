import java.util.Scanner;
public class P1Q3
{
public static int sqrt(int x)
{
return x*x;
}
public static int cube(int x)
{
return x*x*x;
}
public static void main(String[] args)
{
Scanner s1 = new Scanner(System.in);
System.out.println("Enter Number");
int x = s1.nextInt();
int y = sqrt(x);
int z = cube(x);
System.out.println("Square of Number:"+y);
System.out.println("Cube of Number:"+z);
}
}
