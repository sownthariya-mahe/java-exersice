import java.util.*;
import java.util.ArrayList;
class Arralistdemo{
public static void main(String args[])
{
ArrayList<String> arrList=new ArrayList<>();
Scanner sc =new Scanner(System.in);
System.out.println("Enter array value:");
int n = sc.nextInt();
System.out.println("Enter the names: ");
for(int i=0;i<n;i++)
{
arrList.add(sc.next());
}
arrList.add("apple");
arrList.add("orange");
arrList.add("guva");
arrList.add("pinapple");
arrList.add("graphes");
System.out.println("Fruits List: ");
for(String str:arrList)
System.out.println(str);
arrList.add(1,"mango");
System.out.println("Fruits List: ");
for(String str:arrList)
System.out.println(str);
}
}