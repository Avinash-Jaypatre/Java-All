package Abstraction;

abstract class vahicle
{
	abstract void show();
}
class bmw extends vahicle
{
	@Override
	void show() 
	{
		System.out.println("This is bmw mathod");	
	}
}
public class Exm_AbstractClass 
{
	public static void main(String[] args) 
	{
		vahicle obj = new bmw();
		obj.show();
		
		
	}

}
