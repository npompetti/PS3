//import CISC181.Week3.Package4.InsufficientFundsException;


public class Test {
	
	public static void main(String[] args){
		
		//Creating new account instance
		Account Nick_account = new Account(1122,20000);
		
		
		//Setting annual interest rate to 4.5%
		Nick_account.set_AnnualInterest(4.5);
		
		//Withdraw
		try{	
			System.out.println("Withdrawing $2000");
			Nick_account.Withdraw(2000);
		}
		catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"
	                                  + e.getAmount());
	         e.printStackTrace();
	      }
		
		//Deposit
		System.out.println("Depositing $3000");
		Nick_account.Deposit(3000);
		
		//Withdraw that throws exception
		
		
		
		System.out.printf("Your account contains $ %.2f\n", Nick_account.get_Balance());
		
		System.out.println("Your monthly interest is " + Nick_account.get_MonthyInterest()+"%");
		System.out.println("Your account was created on " + Nick_account.get_Date());
		

	}
}
