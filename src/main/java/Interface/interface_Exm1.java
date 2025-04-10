package Interface;
interface  abc
{
	void show();
	public abstract void run();
}
class abcd implements abc
{

	@Override
	public void show() {
		System.out.println("Ovrride 1st method");
		
	}

	@Override
	public void run() {
			System.out.println("Override second method");
		
	}
	
}
public class interface_Exm1 
{
	public static void main(String[] args) 
	{
		abc ref = new abcd();
		ref.show();
		ref.run();
		
	}

}
