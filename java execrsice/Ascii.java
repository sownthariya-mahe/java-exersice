import java.util.*;
	public class Ascii 
	{

	
		public static void main(String[] args)
		{
		
		char ch ;
		Scanner obj1=new Scanner(System.in);
	
		System.out.println("Enter the chracter: "  );
		ch=obj1.next().charAt(0);
		int ascii = ch;
		System.out.println("The ASCII value of " + ch );
		System.out.println(  ascii);
		}
	}
