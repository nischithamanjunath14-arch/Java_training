package com.ExceptionalHandling;

public class E3BankExample {
    public static void main(String[] args) {


        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient balance");
            }
            System.out.println("Withdraw successfull");
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
