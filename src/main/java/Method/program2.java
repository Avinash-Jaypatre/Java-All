package Method;

public class program2
{
	public static int add(int a, int b)
	{
		int result = a+b;
		return result;
	}
	public static double add(double a, int b)
	{
		double result = a+b;
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("Method Beggining ..");
		System.out.println(add(10,20));
		System.out.println("Method Ending ..");
	}

}
