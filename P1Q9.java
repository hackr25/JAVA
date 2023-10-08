import java.util.Scanner;
public class P1Q9
{
public static void main(String[]args)
{
  int n , a , m = 0 , sum = 0;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter 4 Digit Number=");
  n=scan.nextInt();
  do 
 {
   a=n%10;
   m=m*10+a;
   sum=sum+a;
   n=n/10;
 }
while(n>0);
System.out.println("reverse:"+m);
System.out.println("sum:"+sum);
}
}
