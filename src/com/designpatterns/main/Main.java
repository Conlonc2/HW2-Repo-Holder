package com.designpatterns.main;

import com.designpatterns.sensors.*;

/**
 * @author Chris Conlon
 * @author Nana Ahiabli
 * @author John Liu
 * @author Trey DeWald
 */

/********************************************************************
Dummy Classes - Delete After The Other Packages Completed
********************************************************************/
class BankingAccount {}
class CheckProcessor {
	public CheckProcessor() {}
	
	public void pay(double withdrawal_amount) {}
}

abstract class Account {
	abstract void deduct(double amount);
	public Account setNextChain(Account acct) {}
}

class CheckingsAccount extends Account {
	double limit = 0;

	public CheckingsAccount() {}
	
	public CheckingsAccount(double limit) {
		this.limit = limit;
	}
	
	if (amount < 0) {
		//do something
	} 
	
	public Account setNextChain(Account acct) {}
	void deduct(double amount) {}
}

class SavingsAccount extends Account {
	double limit = 0;

	public SavingsAccount() {}
	
	public SavingsAccount(double limit) {
		this.limit = limit;
	}
	
	public Account setNextChain(Account acct) {}
	void deduct(double amount) {}
}

class CreditAccount extends Account {
	double limit = 0;
	
	public CreditAccount() {}
	
	public CreditAccount(double limit) {
		this.limit = limit;
	}
	
	public Account setNextChain(Account acct) {}
	
	void deduct(double amount) {}
}

class Customer { 
	private Led led;
	private BankingAccount checking;
	private CheckProcessor checkProcessor;
	public Customer(double amount) {}
	
	public void addAccount(Account acct) {}
	public boolean validateFund(double withdrawal_amount) {}
}

///////////////// END DUMMY CLASSES /////////////////


// Start Main Class
public class Main{
    public static void main(String[] args){
    	/********************************************************************
    	Set Up Per Assignment 2 Requirement
    	********************************************************************/
    	// Create a Customer with a checking account with $200, 
    	// associate customer with a Led with identifier “Customer” 
    	// associate checking with a Led with identifier “Checking”
        Customer customer = new Customer(200);
        Led led_customer = new Led("customer");
        Led led_checking = new Led("checking");
        Account chk1 = new CheckingsAccount(50);
        CheckProcessor cp1 = new CheckProcessor();
        CheckProcessor cp2 = new CheckProcessor();
        CheckProcessor cp3 = new CheckProcessor();
        
        // addAccount a “Savings” BankAccount with $50
        Account s1 = new SavingsAccount(50);
        customer.addAccount(s1);
        
        // addAccount 3 CreditAccounts each with a limit of $50 
        Account c1 = new CreditAccount(50);
        Account c2 = new CreditAccount(50);
        Account c3 = new CreditAccount(50);
        customer.addAccount(c1);
        customer.addAccount(c2);
        customer.addAccount(c3);

        // associate the 2nd credit account with a Led with identifier “C2”
        Led led_c2 = new Led("c2");
        
    	/********************************************************************
    	Main Class Execution
    	********************************************************************/
        // Chain the Accounts
        chk1.setNextChain(s1);
        s1.setNextChain(c1);
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        
        // Call CheckProcessor to check fund is sufficient for total amount requested by user
        // Before deduction, check if there are sufficient amount in all accounts to total withdrawal amount
        // If insufficient fund, then throw InSufficientFundException
        cp1.pay(150);
        cp2.pay(220);
        cp3.pay(5000);            
    }
}