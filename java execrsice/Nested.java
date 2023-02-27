import java.util.*;
class Nested
{
public static void main(String []args)
{
String name[]={ "sindhu", "divya","arun","abishek","meera","uma","sownthariya","antony","manaoj","sethu","dhanvanth","shiva"};
Scanner nam=new Scanner(System.in);
System.out.println("Enter the Name:  ");
String name1 = nam.next();

if(name1.equalsIgnoreCase("sindhu"))
	{
	System.out.println("Sindhu - Msc -Persuing  ");
	}
else if (name1.equalsIgnoreCase("divya"))
	{

	System.out.println("Divya - Bsc -Complited  ");
	}
else if (name1.equalsIgnoreCase("arun"))
	{

	System.out.println("Arun-B.E - Compited  ");
	}
else if (name1.equalsIgnoreCase("abishek"))
	{

	System.out.println("Abishek-MCA - Persuing  ");
	}
else if(name1.equalsIgnoreCase("meera"))
	{

	System.out.println("Meera-Bsc - Complited");
	}
else if(name1.equalsIgnoreCase("uma"))
	{
	System.out.println("Uma -Bsc - Complited  ");
	}
else if(name1.equalsIgnoreCase("sownthariya"))
	{
	System.out.println("Sownthariya -Msc - Complited  ");
	}
else if(name1.equalsIgnoreCase("antony"))
	{
	System.out.println("Antony -Bsc - Complited  ");
	}
else if(name1.equalsIgnoreCase("sethu"))
	{

	System.out.println("Meera-Bsc - Complited");
	}
else if(name1.equalsIgnoreCase("dhanvanth"))
	{
	System.out.println("Uma -Bsc - Complited  ");
	}
else if(name1.equalsIgnoreCase("shiva"))
	{
	System.out.println("Shiva -Msc - Complited  ");
	}
else 
	{
	System.out.println("No one in this name : ");
	}
}
}




