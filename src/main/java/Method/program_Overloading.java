package Method;

public class program_Overloading 
{
	public static int add(int a,int b)
	{
		System.out.println("Method First ..");
		int result = a+b;
		return result;
	}
	
	public static double add(double a,int b)
	{
		System.out.println("Method Second..");
		int result = (int)(a-b);
		return result;
	}
	
	public static void main(String arg[])
	{
		System.out.println("Method Beggining ..");
		System.out.println(add(10.0,20));
		
	}

}
