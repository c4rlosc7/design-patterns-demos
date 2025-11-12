package com.example.strategy.impl;

import reactor.core.publisher.Mono;

public class PaymentContext {
    private PaymentStrategy strategy;

    // You can set or change the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public Mono<String> pay(double amount) {
        if (strategy == null) {
            return Mono.error(new IllegalStateException("No notification strategy set"));
        }
        return strategy.pay(amount);
    }
}
