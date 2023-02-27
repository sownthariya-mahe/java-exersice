import java.util.*;
public class Treesetdemo
{
	public static void main(String args[])
	{
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(156);
		set1.add(3);
		set1.add(12354);
		Iterator <Integer> set2 = set1.iterator();
		while(set2.hasNext())
		{
		System.out.println(set2.next());
		}
		set1.remove(123);
		set1.add(12);
		

		while(set2.hasNext())
		{
		System.out.println(set2.next());
		}

			
}
}