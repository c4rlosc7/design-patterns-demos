package com.example.strategy.payment.impl;

import com.example.strategy.payment.PaymentStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class PayPalPayment implements PaymentStrategy {

    @Override
    public Mono<String> pay(double amount) {
        log.info("Start Paypal payment ...");
        log.info("IVA 10%");
        log.info("amount: {}", amount);
        return Mono.just("PayPal payment: IVA 10% " + amount + "!");
    }

    @Override
    public String getType() {
        return "PAYPAL";
    }
}
