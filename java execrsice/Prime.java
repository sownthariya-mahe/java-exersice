import java.util.*;
class Prime
{
	public static void main(String []args)
		{
		int i=2,num,count=0;
		
		for(num=2;num<=20;num++)

		{
			for( i = 1;i<num;i++)
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