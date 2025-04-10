package Inheritance;
class parent 
{
	int maney=100;
	void attitude() 
	{
		System.out.println("Parent class ..");
	 
	}
}
class child extends parent
{
	
}
public class SingleInheritance1
{
	public static void main(String[] args) 
	{
	 child obj = new child();
	 System.out.println(obj.maney);
	 obj.attitude();
		
	}

}
