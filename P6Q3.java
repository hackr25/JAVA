
import java.util.Scanner;
public class P6Q3
{
	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	System.out.print("Enter no.of rows:");
	int n = s1.nextInt();
	System.out.print("Enter no.of cols:");
	int m= s1.nextInt();
	int [][] arr1=new int[n][m];
	int [][] arr2 = new int[n][m];
	int [][] sum= new int[n][m];
	int [][] sub=new int[n][m];
	System.out.println("\nEnter element of Matrix-1:");
	for(int i=0;i<arr1.length; i++)
	{
	for(int j=0;j<arr1.length; j++)
	{
	arr1[i][j]=s1.nextInt();
	}
	}
	System.out.println("Enter element of Matrix-2:");
	for(int i=0;i<arr2.length; i++)
	{
	for(int j=0;j<arr2.length; j++)
	{
	arr2[i][j]=s1.nextInt();
	}
	}
	System.out.println("Addition of Matrix:");
	for(int i=0;i<sum.length;i++)
	{
	for(int j=0;j<sum.length; j++)
	{
	sum[i][j]=arr1[i][j]+arr2[i][j];
	}
	}
	for(int i=0;i<sum.length;i++)
	{
	for(int j=0;j<sum.length;j++)
	{
	System.out.println(sum[i][j]);
	}
	}
	System.out.println("Subtraction of Matrix:");
	for(int i=0;i<sub.length;i++)
	{
	for(int j=0;j<sub.length; j++)
	{
	sub[i][j]=arr1[i][j]-arr2[i][j];
	}
	}
	for(int i=0;i<sub.length;i++)
	{
	for(int j=0;j<sub.length;j++)
	{
	System.out.println(sub[i][j]);
	}
	}
	}
}

