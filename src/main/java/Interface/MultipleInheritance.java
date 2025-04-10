package Interface;
interface a
{
	void show();
	public abstract void run();
}
interface b
{
	void display();
}
class app implements a,b
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MultipleInheritance
{
	public static void main(String[] args) 
	{
		app ref = new app();
		ref.display();
		ref.run();
		ref.show();
		
	}

}
