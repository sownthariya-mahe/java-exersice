import java.util.*;
import java.util.ArrayList;
class Vectlinkdemo{
public static void main(String args[])
{
Vector<String> v=new Vector<>();
Scanner sc =new Scanner(System.in);
System.out.println("Enter array value:");
int n = sc.nextInt();
System.out.println("Enter the names: ");
for(int i=0;i<n;i++)
{
v.add(sc.next());
}
v.add("apple");
v.add("orange");
v.add("guva");
v.add("pinapple");
v.add("graphes");
v.remove("guva");
System.out.println("Fruits v: ");
while(sc.hasNext())
{

System.out.println(sc.next());
}
v.add(1,"mango");
System.out.println("Fruits v: ");
for(String str:v)
System.out.println(str);
}
}