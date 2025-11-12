package com.example.strategy.impl;

import reactor.core.publisher.Mono;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public Mono<String> pay(double amount) {
        return Mono.just("PayPal payment: " + amount + "!");
    }
}
