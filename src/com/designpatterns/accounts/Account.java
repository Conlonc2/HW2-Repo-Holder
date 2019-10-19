package com.designpatterns.accounts;

import com.designpatterns.sensors.Led;

abstract class Account{
    public Led identity;
    protected double total; 

    public Account(String identifier, double total){
        identity = new Led(identifier);
        this.total = total;
    }

    public abstract void deduct(double amount);
}