package com.example.strategy.payment;

import reactor.core.publisher.Mono;

public interface PaymentStrategy {
    //void pay(double amount);
    Mono<String> pay(double amount);
    String getType();  // identifies the strategy
}
