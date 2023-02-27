import java.util.Scanner;
class Manager
{
void assigning()
{
int emps;
String projname;
Scanner sc=new Scanner(System.in);
System.out.println("Enter project name");
projname=sc.next();
System.out.println("Enter Employee Count:" );
emps=sc.nextInt();
if(emps==50)
{

System.out.println("u cant access");
}
}
void salary(int a)
{
int sal;
System.out.println( "salary:"+a);
}
}

class TL extends Manager
{
void work()
{
String projectconcept;
Scanner sc=new Scanner(System.in);

System.out.println("project name:" );
projectconcept=sc.next();
System.out.println(projectconcept );

}
}

class Employee extends TL
{
void emp()
{
Scanner sc=new Scanner(System.in);
String employee_name;
String employee_no;
Systegm.out.println("employee_name:" );
employee_name=sc.next();
System.out.println("employee_no:");
employee_no=sc.next();
System.out.println(employee_name );
System.out.println(employee_no);
}
}
 
public class Maininherit
{
public static void main (String []args)
{
Employee objemp = new Employee();
objemp.assigning();
objemp.salary(20000);
objemp.work();
objemp.emp();
}
}