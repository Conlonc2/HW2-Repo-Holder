package com.designpatterns.main;

import com.designpatterns.accounts.*;
/**
 * @author Chris Conlon
 * @author Nana Ahiabli
 * @author John Liu
 * @author Trey DeWald
 */
import com.designpatterns.exceptions.InsufficentFundsException;
import com.designpatterns.payingparty.Customer;

// Start Main Class
public class Main {
	public static void main(String[] args) throws InsufficentFundsException {
		/********************************************************************
		//* Set Up Per Assignment 2 Requirement
		//********************************************************************/
		// Create a Customer with a checking account with $200,
		// associate customer with a Led with identifier �Customer�
		// associate checking with a Led with identifier �Checking�
		Customer cust1 = new Customer(new BankAccount("checkings", 200));
		cust1.addAccount(new BankAccount("savings", 50));
		cust1.addAccount(new CreditAccount("c1", 50));
		cust1.addAccount(new CreditAccount("c2", 50));
		cust1.pay(350);
	}

}
