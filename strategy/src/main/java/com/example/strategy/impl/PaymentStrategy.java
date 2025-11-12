package com.example.strategy.impl;

import reactor.core.publisher.Mono;

public interface PaymentStrategy {
    //void pay(double amount);
    Mono<String> pay(double amount);
}
