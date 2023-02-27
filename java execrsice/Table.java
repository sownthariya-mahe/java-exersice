import java.util.*;
class Table
{
	public static void main(String[]args)
	{
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Table No : ");
	j=sc.nextInt();
	for(i=1;i<17;i++)
	{
	int a = i*j;
	System.out.println( i  +"*"+  j + "="+  a);
	}
	}
}