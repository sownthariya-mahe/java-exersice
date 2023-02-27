class Myexception extends Exception{
String str1;
Myexception (String str2)
{
str1=str2;
}
public String toString()
{
return("My Exception Occurred: " +str1);
}
}

class Example1{
public static void main (String []args)
{
try
{
System.out.println("start of try block");
throw new Myexception("Error Message");
}
catch (Myexception exp)
{
System.out.println("catch Block");
System.out.println(exp);
}
}}