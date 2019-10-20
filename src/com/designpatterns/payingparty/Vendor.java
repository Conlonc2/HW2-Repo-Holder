package com.designpatterns.payingparty;

/**
 * The Vendor class Represents a vendor to whom money is paid when a transaction is completed. 
 */
public class Vendor implements PayingParty{ 

    /**
     * The pay method alerts the vendor the amount being paid
     * @param amount The amount of money paid to the vendor
     */
    public void pay(double amount){
        System.out.println("Payment made in the amount of $" + amount);
    }

}