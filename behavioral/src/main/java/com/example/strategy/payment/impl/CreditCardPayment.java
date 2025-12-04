package com.example.strategy.payment.impl;

import com.example.strategy.payment.PaymentStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public Mono<String> pay(double amount) {
        log.info("Start credit-card payment...");
        log.info("IVA 19%");
        log.info("amount: {}", amount);
        return Mono.just("CreditCard payment: IVA 19% " + amount + "!");
    }

    @Override
    public String getType() {
        return "CARD";
    }
}
