class method_overload
{
   	public void square(double num)
   	{
       		System.out.println("Square of a number: "+ num + " is"  +(num*num));
   	}
   	public void square(float num2)
  	 {
      		 System.out.println("Square of a number: "+ num2 + " is"  +(num2*num2) );
  	 }
}
public class P3Q1
{
   	public static void main(String args[])
   	{
      		method_overload obj = new method_overload();
     		  obj.square(3);
      		 obj.square(10.2);
	}
}
