package Abstraction;
import java.util.Scanner;
abstract class BankBalance
{
	abstract void deposit(double amount);
	void withdrow()
	{
		System.out.println("You can withdrow your maney..");
	}
	void insufficiantbalance()
	{
		System.out.println("Your balance is insufficiantbalance");
	}
}
class atm extends BankBalance
{
 double totalamount; 
	atm(double totalamount)
	{
		this.totalamount=totalamount;
	}
	@Override
	void deposit(double amount)
	{
		if(totalamount<=amount)
		{
			super.withdrow();
		}else
		{
			super.insufficiantbalance();
		}
	}
}
public class Exm_AbstractClass_p1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount");
		double amount = sc.nextDouble();
		BankBalance ref = new atm(amount);	
		ref.deposit(500);
		
	}

}
