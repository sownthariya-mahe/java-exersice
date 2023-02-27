import java.util.*;
class Forstatment
{
	public static void main(String[]args)
	int a;
	{
	Scanner  no = new Scanner(System.in);
	int rollno[]=new int[10];
	for( int a=0; a<10;a++)
		{
		System.out.print("Enter the Rollno: ");
		rollno[a] = no.nextInt();
		}
		
	for(int j=0;j<10;j++)
	{
		System.out.println(rollno[j]);
	}
}
}