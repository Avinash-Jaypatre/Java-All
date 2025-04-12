package Exception;

public class ArrayIndexOutOfBoundsException
{
	public static void main(String[] args)
	{
		System.out.println("Method Start ..");
		int arr[]= {10,20,30};
		try
		{
			System.out.println(arr[3]);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Method Eng..");
	}

}
