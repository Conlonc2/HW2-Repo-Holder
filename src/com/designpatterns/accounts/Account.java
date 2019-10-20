package com.designpatterns.accounts;

import com.designpatterns.exceptions.InsufficentFundsException;
import com.designpatterns.sensors.Led;

/**
 * The abstract Account class is used as a helper handler. Anything that extends this class will implemnt the deduct method.
 */
public abstract class Account {
    public Led identity;
    protected double total;
    protected double toDeduct;
    protected Account next;

    /**
     * Constructor for Account:
     * @param identifier String: The name of the account being created (i.e. checkings/savings)
     * @param balance double: the initial balance to set the account up with.
     */
    public Account(String identifier, double balance) throws com.designpatterns.exceptions.InsufficentFundsException {
        identity = new Led(identifier);
        this.total = balance;
    }
    /**
     * 
     * @param amount double: How much to deduct from account. To be implemnted by children
     */
    public abstract void deduct(double amount);

    /**
     * This method will deduct the amount it can help with from the customer request.
     * If account has enough to fund the customer request deduct from thsi account.
     * If the balance is to low and there is a next account to check set a flag as to how to remove. This will
     * remove the amount as long as the customer transaction is satisfied.
     * Else we will throw an InsufficentFundsException.
     * @param remainder double: The amount a customer requires from the account.
     * @throws InsufficentFundsException
     */
    public void validateFunds(double remainder) throws InsufficentFundsException {
        double test =  this.total - remainder;
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
            this.identity.toggle();
            throw new InsufficentFundsException("Not enough funds!");
        }
    }

    public void setNextChain(Account account){
        this.next = account;
    }

    public String toString(){
        String toReturn = this.identity.toString() + "\n" + "Total: " + this.total + "\nNext Account: " + this.next;
        return toReturn;
    }
}