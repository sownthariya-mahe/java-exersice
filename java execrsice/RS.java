
import java.util.*;
class Fullstack
	{
	int no;
	String name;
	Fullstack()
	{
		System.out.println("constructor called");
	}
                 void Fullstack(int s)
	{
                            int c=10+s;
		System.out.println(c);
	}

	}
class RS 
	{
	public static void main(String []args)
	{
	Fullstack obj1=new Fullstack();
		System.out.println(obj1.name);
		System.out.println(obj1.no);
		obj1.Fullstack(1022);
	}
}
