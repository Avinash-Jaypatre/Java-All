package Inheritance;

class aanimal
{
	void eat()
	{
		System.out.println("Every animal can eat ..!");
	}
}
class cat extends aanimal
{
	void show()
	{
		System.out.println("cat method ");
	}
}
class dog extends cat
{
	void run()
	{
		System.out.println("dog method");
	}
}
public class Multilevel_Inheritance 
{
	public static void main(String[] args)
	{
		dog obj = new dog();
		obj.run();
		obj.show();
		obj.eat();
	}

}
