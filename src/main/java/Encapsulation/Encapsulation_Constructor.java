package Encapsulation;

public class Encapsulation_Constructor
{
	private String name;
	private int age;
	
	
	Encapsulation_Constructor(String name, int age)
	{
		this.name=name;
		this.age =age;
		
	}
	public String getname()
	{
		return name;
		
	}
	public int getage()
	{
		return age;
	}
	
	public String toString()
	{
		return "name of porson :"+name+" age of porson"+age;
	}
	public static void main(String[] args) 
	{
		Encapsulation_Constructor obj = new Encapsulation_Constructor("Appa",22);
		System.out.println(obj.toString());
		
		
	}

}
