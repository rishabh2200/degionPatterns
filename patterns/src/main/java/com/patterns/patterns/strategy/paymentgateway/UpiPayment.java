package com.patterns.patterns.strategy.paymentgateway;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void payment() {
        System.out.println("upi is succefull");
    }
}
