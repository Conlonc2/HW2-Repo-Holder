package com.designpatterns.accounts;

import com.designpatterns.exceptions.InsufficentFundsException;

public class BankAccount extends Account {

    public BankAccount(String identity, double total) throws InsufficentFundsException {
        super(identity, total);
    }

    public void deduct(double amount){
        super.total -= amount;
    }
}