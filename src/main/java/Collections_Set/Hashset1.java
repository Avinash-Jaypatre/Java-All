package Collections_Set;
import java.util.*;
public class Hashset1
{
	public static void main(String[] args) 
	{
		HashSet<Object> set = new HashSet();
		set.add("Avinash");
		set.add("Appa");
		set.add(1);
		set.add('c');
		set.add(null);
		set.add("Avinash");
		set.add(null);
		set.add(true);
		
		System.out.println(set);
		
		int count=0;
		for(Object arr : set)
		{
			if("Avinash".equals(arr))
			{
				count++;	
			}
			
		}
		System.out.println(""+count);
	}

}


