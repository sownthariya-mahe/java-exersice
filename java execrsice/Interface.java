import java.util.Scanner;

interface Area
{
public void Square();
public void Circle();
public void Rectangle();
public void Triangle();
}



class Interface implements Area
{
public void Circle()
{
Scanner kb =new Scanner(System.in);
System.out.println("enter the radius ");
double r=kb.nextInt();
double areaofcircle=3.142*r*r;
System.out.println("area of circle:");
}

public void Square()
{
Scanner kb2 =new Scanner(System.in);
System.out.println("enter the length of side ");
double s=kb2.nextInt();
double areaofsquare=s*s;
System.out.println("area of square:" + areaofsquare);
}

public void Rectangle()
{
Scanner kb3 =new Scanner(System.in);
System.out.println("enter the length of rectangle ");
double l=kb3.nextInt();
System.out.println("enter the breadth of rectangle ");
double b=kb3.nextInt();
double areaofrectangle=l*b;
System.out.println("area of rectangle:" + areaofrectangle);
}
public void Triangle()
{
Scanner kb4 =new Scanner(System.in);
System.out.println("enter the base of triangle ");
double base=kb4.nextInt();
System.out.println("enter the height of triangle");
double h=kb4.nextInt();
double areaoftriangle=0.5*base*h;
System.out.println("area of triangle:" + areaoftriangle);
}

public static void main (String []args)
{
Interface geomentry = new Interface();
geomentry.Circle();
geomentry.Square();
geomentry.Rectangle();
geomentry.Triangle();
}
}


