import java.util.*;
class Arraytry
{
	public static void main(String[]args)
	{
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array items no: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array value : ");
	try
	{
		for ( i=0;i<=n;i++)
		{
			System.out.println("Array value: " + a[i]);
			a[i] = sc.nextInt();		
			System.out.println("Array value: " + a[i]);
		}
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("array class ");
	}

}
}
