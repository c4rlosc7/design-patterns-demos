package com.example.strategy.service;

import com.example.strategy.factory.PaymentStrategyFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PaymentService {
    private final PaymentStrategyFactory factory;

    public PaymentService(PaymentStrategyFactory factory) {
        this.factory = factory;
    }

    public Mono<String> processPayment(String type, double amount) {
        var strategy = factory.getStrategy(type);

        if (strategy == null) {
            return Mono.just("Invalid payment type: " + type);
        }

        return strategy.pay(amount);
    }
}
