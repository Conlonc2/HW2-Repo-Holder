package com.designpatterns.accounts;

import com.designpatterns.exceptions.InsufficentFundsException;

public class CheckProcessor{

    public void processCheck(BankAccount acc, double amt){
        try{
            acc.validateFunds(amt);
        }
        catch (InsufficentFundsException err){
            System.out.println(err.getMessage());
        }
    }
}