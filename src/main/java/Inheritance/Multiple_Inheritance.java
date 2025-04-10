package Inheritance;
class aaanimal
{
	void show()
	{
		System.out.println("This is a parent method");
	}
}
class dogesh extends aaanimal
{
	void pp()
	{
		super.show();
		System.out.println("Degesh dada method ..");
	}
}
public class Multiple_Inheritance 
{
	public static void main(String[] args)
	{
		dogesh obj = new dogesh();
		obj.pp();

		
	}
	  
}
