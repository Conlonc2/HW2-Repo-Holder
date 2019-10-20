package com.designpatterns.accounts;

import com.designpatterns.exceptions.InsufficentFundsException;
import com.designpatterns.sensors.Led;

public abstract class Account {
    public Led identity;
    protected double total;
    protected double toDeduct;
    protected Account next;

    public Account(String identifier, double balance) throws com.designpatterns.exceptions.InsufficentFundsException {
        identity = new Led(identifier);
        this.total = balance;
    }

    public abstract void deduct(double amount);

    public void validateFunds(double remainder) throws InsufficentFundsException {
        double test =  this.total - remainder;
        System.out.println(test);
        if(test >= 0.0){
            deduct(remainder);
        }
        else
        if(test < 0 && this.next != null){
            toDeduct = this.total;
            this.next.validateFunds(remainder-this.total);
            this.deduct(toDeduct);
        }
        else{
            throw new InsufficentFundsException("Not enough funds!");
        }
    }

    public void setNextChain(Account account){
        this.next = account;
    }
}