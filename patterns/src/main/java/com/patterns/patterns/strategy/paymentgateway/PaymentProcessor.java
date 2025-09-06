package com.patterns.patterns.strategy.paymentgateway;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(){
        paymentStrategy.payment();
    }
}
