import java.util.Scanner;
abstract class Functions
{
	abstract void Add();
	abstract void Sub();
	abstract void Mul();
	void Divi()
	{
		int a,b;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		c=a/b;
		System.out.println("Sum of  Division value: " +c);
	}

	void Mod()
	{
		int a,b;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		c=a%b;
		System.out.println("Sum of Modulase value: " +c);
	}
}
class Calculator_3num 
{
	void Add()
	{
		int a,b,d,e;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		System.out.println("enter the 1st value: ");
		d=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		e=ob1.nextInt();
		c=a+b+c+d;
		System.out.println("Sum of Addition 4 value: " +c);
	}

class Calculator_abst extends Functions
{
	void Add()
	{
		int a,b;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		c=a+b;
		System.out.println("Sum of Addition value: " +c);
	}
	
	/*void Add(int a,int b,int d)
	{
		
	
		int c=a+b+d;
		System.out.println("Sum of Addition 3 value: " +c);
	}*/

	 void Sub()
	{
		int a,b;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		c=a-b;
		System.out.println("Sum of  Subraction value: " +c);
	}

	 void Mul()
	{
		int a,b;
		double c;
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter the 1st value: ");
		a=ob1.nextInt();
		System.out.println("enter the 2nd value: ");
		b=ob1.nextInt();
		c=a*b;
		System.out.println("Sum of Multiplication value: " +c);
	}
	
	void Mul(int a,int b,int d)
	{
	
		double c;
		c=a*b*d;
		System.out.println("Sum of Multiplication 3 value: " +c);
	}

	


	public static void main(String []args)
	{
		Scanner obj3=new Scanner(System.in);
		String func[]={"1.Add","2.Subtraction ","3.Multiplication","4.Division","5.Modulas"};
		for(int i=0;i<=4;i++)
	{
		System.out.println(func[i]);

	}
		System.out.println("Select one operation :");
		String op=obj3.next();
		Calculator_abst obj2=new Calculator_abst();
		//obj2.Add(25,85,96);
		//obj2.Mul(2,5,8);
		Calculator_3num obj4=new Calculator_3num();
		obj4.Add();
	switch(op)
	{
		case "1.Add":
		obj2.Add();
		break;
		case "2.Subtraction":
		obj2.Sub();
		break;
		case "3.Multiplication":
		obj2.Mul();
		break;
		case "4.Division":
		obj2.Divi();
		break;
		case "5.Modulas":
		obj2.Mod();
		break;
		default:
		System.out.println(" no operation there");
	}
}
}
}