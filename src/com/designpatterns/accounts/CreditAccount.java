package com.designpatterns.accounts;

public class CreditAccount extends Account{
    

    public CreditAccount(String identity, double total) throws com.designpatterns.exceptions.InsufficentFundsException{
        super(identity, total);
    }

    public void deduct(double amount){
        super.total -= amount;
    }
}