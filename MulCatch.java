import java.util.*;
class MulCatch
{
public static void main(String[]args)
{
	int a, b, ans=0;
	Scanner s=new Scanner (System.in);
	System.out.println("Enter any two numbers: ");
	try{
		a = s.nextInt();
		b = s.nextInt();
		ans = a/b;
		System.out.println("Result: "+ans);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Denominator should not be Zero");
	}
	catch(Exception e)
	{
		System.out.println("Enter a valid number");
	}
}
}