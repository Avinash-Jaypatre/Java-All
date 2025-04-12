package Exception;

public class NullPointerException {

	public static void main(String[] args)
	{
		System.out.println("Method start ..");
		String name =null;
		try
		{
			System.out.println(name.length());	
		}catch(Exception e)
		{
			System.out.println("Succesfully handle NullPointerException ..");
		}
		System.out.println("Method end..");
		

	}

}
