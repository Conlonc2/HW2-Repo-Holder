package com.designpatterns.exceptions;
import java.lang.Exception;

public class InsufficentFundsException extends Exception {
    public InsufficentFundsException(String errorMessage) {
        super(errorMessage);
    }
}