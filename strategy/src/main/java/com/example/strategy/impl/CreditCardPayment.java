package com.example.strategy.impl;

import reactor.core.publisher.Mono;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public Mono<String> pay(double amount) {
        return Mono.just("CreditCard payment: " + amount + "!");
    }
}
