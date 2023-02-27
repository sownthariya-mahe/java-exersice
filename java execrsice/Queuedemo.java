import java.util.*;
import java.util.Queue;
public class Queuedemo
{
	public static void main(String args[])
	{
		Queue<Integer> set1 = new LinkedList<>();
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