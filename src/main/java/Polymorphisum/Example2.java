package Polymorphisum;


public class Example2 extends Example 
{
	void show(String msg)
	{
		System.out.println("Parameterized method..");
	}
	public static void main(String[] args) 
	{
		Example2 obj = new Example2();
		obj.show("NA");
		
	}

}
