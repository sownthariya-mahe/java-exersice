import java.util.*;
class Foreach
{
	public static void main(String []args)
	
	{

		int i;
		int name[]=new int[5];
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter name : ");
		name[i]=obj.nextInt();

		for(int i:name)
		{
			name[i]=obj.nextInt();
			System.out.println(name[i]);
			
		}
			
	}
}

