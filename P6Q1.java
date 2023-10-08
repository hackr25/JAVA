
import java.util.Scanner;

class P6Q1
{
	public static void main(String []args)
	{
	int n;
	Scanner sc = new Scanner(System.in);
	n=10;
	int arr[] = new int[n];

	System.out.println("Enter the elements in array :");
	for(int i = 0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Odd Numbers");
	for(int i = 0; i<n; i++)
	{
		if(arr[i]%2 !=0)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	System.out.println("Evan Numbers");
	for(int i = 0; i<n; i++)
	{
		if(arr[i]%2 ==0)
		{
			System.out.println(arr[i]+ " ");
		}
	}
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
	{
		if (arr[i]>max)
		max = arr[i];
	}
	{
		System.out.println("Maximum number in array is "+ max);
	}
		int min = arr[0];
		for(int i = 0; i<arr.length; i++)
	{
		if (arr[i]<min)
		min = arr[i];
	}
		{
		System.out.println("Minimum number in array is "+ min);
		}
	
	}
}
