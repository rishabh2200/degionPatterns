package com.patterns.patterns.strategy.paymentgateway;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new UpiPayment());
        paymentProcessor.payment();
    }
}
