package Collection_List;
import java.util.*;
public class LinkedList1
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(null);
		list.add(true);
		list.add("Avinash");
		list.add('c');
		list.add(1.1);
		list.add(null);
		list.add(1);
		
		System.out.println(list);
		
		LinkedList list1 = new LinkedList();
		
		list1.addAll(list);					
		
		list1.add(0, "Avinash");
		System.out.println(list1);
		
		list1.remove("Avinash");
		System.out.println(list1);
		
		list1.remove(3);
		System.out.println(list1);
		//list1.removeAll(list1);
		list1.clear();
		System.out.println(list1);
		
		
		System.out.println(list.contains("Avinash"));
		list.remove("Avinash");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for(Object num : list)
		{
			System.out.println(num);
		}
	}

}
