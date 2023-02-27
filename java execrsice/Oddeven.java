import java.util.*;
public class Oddeven
{  
	public static void main(String args[])
{  
	
	Scanner no=new Scanner(System.in);
	int rollno[]=new int[100]; 


	System.out.println("Odd Numbers:");  
	for(int a=0;a<=20;a++)
	{  
	if(a%2==1)
	{  
	rollno[a]=a;
	System.out.println(rollno[a]);  
	}  }
	System.out.println("Even Numbers:");  
	for(int a=0;a<=20;a++)
	{  
	if(a%2==0)
	{  
	rollno[a]=a;
	System.out.println(rollno[a]);  
}}
 
}}  