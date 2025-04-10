package This;

public class program2
{
	int a;
	int b;
	int display(int a ,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Method start ..");
		return a+b;
	}
	int show()
	{
		int result = a+b;
		return result;
	}
	public static void main(String[] args) 
	{
	System.out.println("M..S");
	program2 obj = new program2();
	System.out.println(obj.display(10, 10));
	System.out.println(obj.show());
		
	}

}
