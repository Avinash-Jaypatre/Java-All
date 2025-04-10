package Object;

public class Program 
{
	public void display()
	{
		System.out.println("Method Body ..");
	}
	public static void main(String[] args) 
	{
		Program obj = new Program();
		Program obj1 = new Program();
		obj.display();
		System.out.println(obj);
		System.out.println(obj1);
		
	}

}
