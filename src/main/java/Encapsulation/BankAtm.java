package Encapsulation;
class atm
{
	double yourmaney;
	private double maney;
	 atm(double yourmaney)
	{
		this.yourmaney=yourmaney;
	}
	void setdata(double maney)
	{
		this.maney=maney;
	}
	double getdata()
	{
		return maney;
	}
	
	void withdrow() 
	{
		if(yourmaney<=maney)
		{
			System.out.println("You Can Withdrow Maney..");
		}
		
	}
}
public class BankAtm 
{
	public static void main(String[] args) 
	{
		atm obj = new atm(100000);
		obj.setdata(10000);
		System.out.println(obj.getdata());
		obj.withdrow();
		
		
	}

}
