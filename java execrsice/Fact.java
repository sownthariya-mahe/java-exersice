import java.util.*;
class Fact
{
	public static void main(String []args)
	{
	int n;
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter Factorial No:");
	n=obj1.nextInt();
	for(n=1;n<10;n++)
	{
	int fact=n*(n-1);
	System.out.println(fact);
	}
}
	