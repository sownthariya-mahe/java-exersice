import java.util.*;
import java.util.HashMap;
public class LinkedHasmapdemo
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> set1 = new LinkedHashMap<>();
		set1.put(1, "Sownthariya");
		set1.put(156,"uma");
		set1.put(3,"manoj");
		set1.put(12,"dhanvanth");

		Set set =set1.entrySet();// pre defined function to display r print the  entered value, Set keywod must while creating hassmap
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
		Map.Entry m=(Map.Entry)iterator.next();
		System.out.println("key is: " + m.getKey() + "Value is:");
		System.out.println(m.getValue()); // get value,get key predefined
		}

			
}
}