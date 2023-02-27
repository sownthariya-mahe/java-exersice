import java.util.Scanner;
interface Functions
{
	public void Add();
	public void Sub();
	public void Mul();
	public void Divi();
	public void Mod();
}

class Calculator implements Functions
{
	public void Add()
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

	public void Sub()
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

	public void Mul()
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

	public void Divi()
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

	public void Mod()
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
		Calculator obj2=new Calculator();
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