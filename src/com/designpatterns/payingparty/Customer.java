package com.designpatterns.payingparty;

import com.designpatterns.accounts.Account;
import com.designpatterns.accounts.BankAccount;
import com.designpatterns.accounts.CheckProcessor;


public class Customer implements PayingParty{


    /**
     * 
     * @param BankAccount 
     * @param checkProcessor
     */
    private BankAccount checking;
    public CheckProcessor checkProcessor = new CheckProcessor();

    public Customer(BankAccount checking){
       this.checking = checking;
    }
    /**
     * 
     * @return
     */
    public void addAccount(Account acc){

        if (checking.getNext() == null){
            this.checking.setNextChain(acc);
            return;
        }
        Account current = checking;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNextChain(acc);
    }

    /**
     * 
     * @param amount
     * @return
     */
    public double pay(double amount){
        this.checkProcessor.processCheck(checking, amount);
        return amount;
    }
}