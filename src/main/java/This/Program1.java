package This;

public class Program1
{
	public void sheela()
	{
		System.out.println("Method Beggining ..");
		System.out.println("this :"+this);
		System.out.println("Method Ending ..");
	}

	public static void main(String[] args)
	{
		System.out.println("M..B");
		Program1 obj = new Program1();
		obj.sheela();
		System.out.println("M..E");
		
	
	}

}
