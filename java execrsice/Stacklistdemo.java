import java.util.*;
import java.util.ArrayList;
class Stacklistdemo{
public static void main(String args[])
{
Stack<String> list=new Stack<>();
Scanner sc =new Scanner(System.in);
System.out.println("Enter array value:");
int n = sc.nextInt();
System.out.println("Enter the names: ");
for(int i=0;i<n;i++)
{
list.push(sc.next());
}
list.push("apple");
list.push("orange");
list.push("guva");
list.push("pinapple");
list.push("graphes");
System.out.println("Fruits List: ");
while(sc.hasNext())
{

System.out.println(sc.next());
}
list.push("mango");
System.out.println("Fruits List: ");
for(String str:list)
System.out.println(str);
System.out.println("last value: " + list.peek());
}
}