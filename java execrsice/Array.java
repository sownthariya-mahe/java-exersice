import java.util.*;
class Array
{
	public static void main(String[]args)
	{
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array items no: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array value : ");
	for ( i=0;i<=n;i++){
		System.out.println("Array value: " + a[i]);
		a[i] = sc.nextInt();		
		System.out.println("Array value: " + a[i]);
	}
	//for(int j=0;j<n;j++){
		//System.out.println(j);
		
	
	}
}