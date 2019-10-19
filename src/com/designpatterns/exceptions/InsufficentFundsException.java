package com.designpatterns.exceptions;

public class InsufficentFundsException extends Exception {
    public InsufficentFundsException(String errorMessage) {
        super(errorMessage);
    }
}