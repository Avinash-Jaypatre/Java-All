package String;

public class reversestring
{
	public static void main(String[] args) 
	{
		String name="Avinash";
		int count =name.length();
		char ch ;
		for(int i=count-1;i>=0;i--)
		{
			ch = name.charAt(i);
			System.out.print(ch);
		}
		
		
	}

}
