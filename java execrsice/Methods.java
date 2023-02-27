import java.util.*;
class Methods
{

	String met1()      // datatype methodname()
	{
		String a= "sownthariya", b= "mahes";
		System.out.println(a + b);
		return(a+b); // must need to give function
	}
                   int met2()
	{
	  	int value1=25, value2=35;
		System.out.println(value1*value2);
		return(value1*value2);
	}
	float met3()
	{
		float y=25.985f,x=685.458f;
		System.out.println(y+x);
		return (x+y);
	}
	String met4()
	{
		String c="h", d="i";
		System.out.println(c+d);
		return(c+d);
	}

		public static void main(String[]args)
		{
		Methods obj=new Methods();// classname objectname= new classname();
		obj.met1();	//objectname.methodname();
		obj.met2();
		obj.met3();
		obj.met4();
		}
}
