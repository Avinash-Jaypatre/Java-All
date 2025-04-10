package Inheritance;
class building
{
	void area()
	{
		System.out.println("class building");
	}
}
class aprtment extends building 
{
	void flaits()
	{
		System.out.println("Class Apartment");
	}
}
class room extends aprtment
{
	
}
public class maltilevelInheritance 
{
	public static void main(String[] args) 
	{
		room obj = new room();
		obj.area();
		obj.flaits();
		
	}

}
