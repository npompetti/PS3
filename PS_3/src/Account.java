//Nicholas Pompetti

import java.util.Date;
import java.util.Scanner;

//import CISC181.Week3.Package4.InsufficientFundsException;

public class Account {
	
	//data field
	
	private int id = 0;
	
	private double balance = 0;
	
	private double annualInterestRate = 0;
	
	private Date dateCreated;
	
	//No arg constructor
	
	public Account(){
	}
	
	//Constructor with two parameters (int) ID of account and the (double) initial balance
	
	public Account(int ID, double initBalance){
		this.id = ID;
		this.balance = initBalance;
		this.dateCreated = new Date();
	}
	
	//Accessers
	
	public int get_ID(){
		return id;
	}
	
	public double get_Balance(){
		return balance;
	}
	
	public double get_Interest(){
		return annualInterestRate;
	}
	
	public Date get_Date(){
		return dateCreated;
	}
	
	//Mutators
	
	public void change_ID(int acct_number){
		this.id= acct_number;
	}
	
	public void set_Balance(double balance){
		this.balance = balance;
		
	}
	
	public void set_AnnualInterest(double interest){
		this.annualInterestRate=interest;
	}
	
	public double get_MonthyInterest(){
		double monthly_interest= annualInterestRate/12;
		return monthly_interest;
	}
	//Withdraw method with insufficient funds exception added
	public void Withdraw(double money) throws InsufficientFundsException{
		if(money <=balance){
		balance -= money;
		}
		else{
			double not_available = money - balance;
			throw new InsufficientFundsException(not_available);
		}
	}
		
	//public method for user to deposit money
	public void Deposit(double money){
		balance+=money;
	}
	
	
	
/*
 * 	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Account Nick = new Account(100001, 10000);
		System.out.println(Nick.id);
		
		System.out.println(Nick.get_Date());
		
		Nick.set_AnnualInterest(7.0);
		System.out.printf("Your monthly interest rate is %.2f\n", Nick.get_MonthyInterest());

		
		System.out.println("How much are you withdrawing? ");
		double deposit = input.nextDouble();
		Nick.Withdraw(deposit);
		
		System.out.println(Nick.get_Balance());
		
		String fs;
		fs = String.format("Your balance is %.2f", Nick.balance);
		System.out.print(fs);
 */
	
}