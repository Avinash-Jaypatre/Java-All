package Collection_List;
import java.util.*;

public class Vector1
{
	public static void main(String[] args) 
	{
		Vector<Object> list = new Vector<>();
		list.add(1);
		list.add(null);
		list.add(true);
		list.add("Avinash");
		list.add('c');
		list.add(1.1);
		list.add(null);
		list.add(1);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(Object arr:list)
		{
			System.out.println(arr);
		}

		
	}
	
}
