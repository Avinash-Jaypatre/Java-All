package Inheritance;

class animal
{
	void show()
	{
		System.out.println("Hello");
	}
}

public class Single_Inheritance extends animal
{
	public static void main(String[] args) 
	{
		Single_Inheritance obj = new Single_Inheritance();
		obj.show();
	}
}
