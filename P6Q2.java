
import java.util.Scanner;

class P6Q2
{
	public static void occur(int arr[],int s)
	{
		int c=0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==s)
			{
				c=c+1;
			}
		}
		System.out.println("Occurance of "+ s +" in an Array "+c);
	}

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
	System.out.println("Enter a number to Occur :");
	int s = sc.nextInt();
	occur(arr,s);
}
}
