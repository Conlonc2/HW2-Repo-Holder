package com.designpatterns.accounts;

import com.designpatterns.exceptions.InsufficentFundsException;
import com.designpatterns.payingparty.Vendor;

public class CheckProcessor{

    public void processCheck(BankAccount acc, double amt){
        try{
            acc.validateFunds(amt);
            new Vendor().pay(amt);
        }
        catch (InsufficentFundsException err){
            System.out.println(err.getMessage());
        }
    }
}