
import java.util.Scanner;
class P6Q4
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter How Many Element You Want in Array :");
	int n = sc.nextInt();
	System.out.println("Enter the elements in array :");
	int [] arr = new int[n];
	for(int i = 0; i<arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter element to search :");
	int s = sc.nextInt();
	for(int i = 0; i<arr.length; i++)
	{
		if(arr[i]==s)
		{
		System.out.println("Postition of number is :"+(i+1));
		}
	}
}
}

