package Abstraction;
abstract class Ex 
{
	public abstract void show();
	
	void display()
	{
		System.out.println("Your Pass");
	}
}
class Ex1 extends Ex
{
	@Override
	public void show() {
		System.out.println("This is Override method..");
	}
}
public class Exm_AbstractClass_p2
{
	public static void main(String[] args) 
	{
		
	}

}
