package Encapsulation;
public class PersonDetails
{
	private int age;
	private String name;
	
	public void setDetail(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public String getname()
	{
		return name;
	}
	public String toString ()
	{
		return "Person name: "+name+" Person age :"+age;
	}
	public static void main(String[] args) 
	{
		PersonDetails obj = new PersonDetails();
		obj.setDetail(10,"Akshay");
		System.out.println(obj.toString());
		
		
	}

}
