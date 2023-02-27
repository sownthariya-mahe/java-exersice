import java.util.*;
import java.util.ArrayList;
class Listlinkdemo{
public static void main(String args[])
{
LinkedList<String> list=new LinkedList<>();
Scanner sc =new Scanner(System.in);
System.out.println("Enter array value:");
int n = sc.nextInt();
System.out.println("Enter the names: ");
for(int i=0;i<n;i++)
{
list.add(sc.next());
}
list.add("apple");
list.add("orange");
list.add("guva");
list.add("pinapple");
list.add("graphes");
System.out.println("Fruits List: ");
while(sc.hasNext())
{

System.out.println(sc.next());
}
list.add(1,"mango");
System.out.println("Fruits List: ");
for(String str:list)
System.out.println(str);
}
}