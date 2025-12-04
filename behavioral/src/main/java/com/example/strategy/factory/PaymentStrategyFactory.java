package com.example.strategy.factory;

import com.example.strategy.payment.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PaymentStrategyFactory {
    private final Map<String, PaymentStrategy> strategies;

    public PaymentStrategyFactory(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies.values().stream()
                .collect(Collectors.toMap(PaymentStrategy::getType, s -> s));
    }

    public PaymentStrategy getStrategy(String type) {
        return strategies.get(type.toUpperCase());
    }
}
