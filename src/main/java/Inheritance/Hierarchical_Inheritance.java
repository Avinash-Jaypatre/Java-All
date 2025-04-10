package Inheritance;

class Annimal
{
	void show()
	{
		System.out.println("Animal class ");
	}
}
class catt extends Annimal
{
	void catmethod()
	{
		System.out.println("this is a cat method ..");
	}
}
class doog extends Annimal
{
	void doogmethod()
	{
		System.out.println("Hoo");
	}
}
public class Hierarchical_Inheritance 
{

	public static void main(String[] args)
	{
		catt obj = new catt();
		obj.show();
		obj.catmethod();
		
		doog obj1 = new doog();
		obj1.doogmethod();
		obj.show();

	}

}
