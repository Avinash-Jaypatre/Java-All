package Collection_List;
import java.util.*;
public class Arraylist1 
{
	public static void show(Object list)
	{
		if(list == null)
		{
			System.out.println("List have no null object ..");
		}else
		{
			System.out.println("list  does not have null obj");
		}
		
	}
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add(true);
		list.add("Avinash");
		list.add('c');
		list.add(1.1);
		list.add(null);
		list.add(1);
		
		System.out.println(list);
		
		show(list);
		
	}

}
