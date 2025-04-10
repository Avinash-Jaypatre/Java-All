package Polymorphisum;

public class Example
{
	void show()
	{
		System.out.println("No arg method");
	}
	void show(String msg)
	{
		System.out.println("Parametrise method");
	}
	public static void main(String[] args) 
	{
		Example obj = new Example();
		obj.show();
		obj.show("NA");
		
	}

}
