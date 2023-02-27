import java.util.*;
public class LinkedHashsetdemo
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(12);
		set1.add(123);
		set1.add(1234);
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