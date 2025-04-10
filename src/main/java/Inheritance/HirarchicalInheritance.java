package Inheritance;
class libarary
{
	void books()
	{
		System.out.println(" all books ");
	}
}
class stu extends libarary
{
	void access()
	{
		System.out.println("You can acess all book");
	}
}
class teacher extends libarary
{
	void access()
	{
		System.out.println("you can access all book");
	}
}
public class HirarchicalInheritance
{
	public static void main(String[] args) 
	{
		stu obj = new stu();
		obj.books();
		obj.access();
		
		teacher obj1 = new teacher();
		obj1.books();
		obj1.access();
	}

}
