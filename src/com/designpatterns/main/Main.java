package com.designpatterns.main;

import com.designpatterns.sensors.*;
import com.designpatterns.accounts.*;
/**
 * @author Chris Conlon
 * @author Nana Ahiabli
 * @author John Liu
 * @author Trey DeWald
 */
import com.designpatterns.exceptions.InsufficentFundsException;

/********************************************************************
 * Dummy Classes - Delete After The Other Packages Completed
 ********************************************************************/

class Customer {
	private Led led;
	private Account checking;

	public Customer(double amount) {
	}

	public void addAccount(Account acct) {
	}

	public void validateFund(double withdrawal_amount) {
	}
}

///////////////// END DUMMY CLASSES /////////////////

// Start Main Class
public class Main {
	public static void main(String[] args) {
		/********************************************************************
		 * Set Up Per Assignment 2 Requirement
		 ********************************************************************/
		// Create a Customer with a checking account with $200,
		// associate customer with a Led with identifier �Customer�
		// associate checking with a Led with identifier �Checking�
		Customer customer = new Customer(200);
		Led led_customer = new Led("customer");
		Led led_checking = new Led("checking");
		Account chk1;
		try {
			chk1 = new BankAccount("checkings", 50.0);
			chk1.validateFunds(100.0);
		} catch (InsufficentFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		 }
		}
}
// // CheckProcessor cp1 = new CheckProcessor();
// // CheckProcessor cp2 = new CheckProcessor();
// // CheckProcessor cp3 = new CheckProcessor();

// // addAccount a �Savings� BankAccount with $50
// Account s1 = new BankAccount("savings", 50);
// customer.addAccount(s1);

// // addAccount 3 CreditAccounts each with a limit of $50
// Account c1 = new CreditAccount("c1",50);
// Account c2 = new CreditAccount("c2",50);
// Account c3 = new CreditAccount("c3",50);
// customer.addAccount(c1);
// customer.addAccount(c2);
// customer.addAccount(c3);

// // associate the 2nd credit account with a Led with identifier �C2�
// Led led_c2 = new Led("c2");

// /********************************************************************
// Main Class Execution
// ********************************************************************/
// // Chain the Accounts
// chk1.setNextChain(s1);
// s1.setNextChain(c1);
// c1.setNextChain(c2);
// c2.setNextChain(c3);

// // Call CheckProcessor to check fund is sufficient for total amount requested
// by user
// // Before deduction, check if there are sufficient amount in all accounts to
// total withdrawal amount
// // If insufficient fund, then throw InSufficientFundException
// // cp1.pay(150);
// // cp2.pay(220);
// // cp3.pay(5000);
// }
