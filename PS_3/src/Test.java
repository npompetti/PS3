


public class Test {
	
	public static void main(String[] args){
		
		//Creating new account instance
		Account Nick_account = new Account(1122,20000);
		
		
		//Setting annual interest rate to 4.5%
		Nick_account.set_AnnualInterest(4.5);
		
		//Withdraw
		Nick_account.Withdraw(2000);
		
		//Deposit
		Nick_account.Deposit(3000);
		
		System.out.printf("Your account contains $ %.2f\n", Nick_account.get_Balance());
		
		System.out.println("Your monthly interest is " + Nick_account.get_MonthyInterest()+"%");
		System.out.println("Your account was created on " + Nick_account.get_Date());
		
		//System.out.println("Withdrawing $50000..");
		//Nick_account.Withdraw(50000);

	}
}
