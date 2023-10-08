 import java.util.Scanner;
public class P1Q4
{
public static void main(String[]args)
{
  int id;
  char name;
  float a,b,c;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Student ID: ");
  id=sc.nextInt();
  System.out.println("Enter Student Name: ");
  name=sc.next().charAt(0);
  System.out.println("Enter Your Marks scored in Maths, English, Science\n");
  a=sc.nextFloat();
  b=sc.nextFloat();
  c=sc.nextFloat();
  float total=(a+b+c);
  float avg=total/3;
  System.out.println("Total marks of Student = "+total);
  System.out.println("Average Marks of Student is  = "+avg);
}
}
