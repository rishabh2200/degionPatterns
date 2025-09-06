package com.patterns.patterns.strategy.paymentgateway;

public class CreditCard implements PaymentStrategy {
    @Override
    public void payment() {
        System.out.println("Credit Payment is succefull");
    }
}
