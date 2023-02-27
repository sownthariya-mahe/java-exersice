import java.util.*;
class Bank
{
	public static void main(String[]args)
	{
	Scanner amt = new Scanner(System.in);// amt is object name 
	System.out.print("Enter your balance : ");
	int amount=amt.nextInt();
	if (amount>=500)
		{
		System.out.println("your eligble for loan");
		}
	else
		{
		System.out.println("better luck next time");
		}
	System.out.print("Enter your age : ");
	int age=amt.nextInt();
	if(age>18)
		{
		System.out.println("your eligble for loan");
		}
	else
		{
		System.out.println("your not eligble");	
		}
			
}
}


