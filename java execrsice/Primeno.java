import java.util.*;
class Primeno
{
	public static void main(String []args)
		{
		int i=2,num,count=0;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the No:");
		num=obj1.nextInt();
	
		{
		/*if(num<=1)
			{
			System.out.println("the no is prime : "+num);
			return;
			}*/
		

			for( i = 2;i<num/2;i++)
			{
				if(num%i ==0)
				{
				count++;
				}
			}
			if(count<1)
			{
			System.out.println("the no is prime : "+num);
			}
			else
			{
			System.out.println("the no is non prime:"+num);
			}
		}}
		
	
}