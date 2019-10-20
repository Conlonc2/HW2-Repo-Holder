package com.designpatterns.payingparty;
import com.designpatterns.sensors.Led;
import com.designpatterns.accounts.Account;
import com.designpatterns.accounts.CheckProcessor;


public class Customer implements PayingParty{


    /**
     * 
     * @param led
     * @param BankAccount 
     * @param amount
     * @param checkProcessor
     */
    private Led led;
    private BankAccount checking;
    private double amount;
    public CheckProcessor checkProcessor;

    public Customer(BankAccount checking){
       this.checking = checking;
    }
    /**
     * 
     * @return
     */
    public Account addAccount(){

    }

    /**
     * 
     * @param amount
     * @return
     */
    public double pay(double amount){
        this.amount = amount;
        checkProcessor.processCheck(checking, amount);
        return amount;
    }
}