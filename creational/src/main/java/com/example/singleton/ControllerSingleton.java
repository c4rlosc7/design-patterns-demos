package com.example.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleton")
public class ControllerSingleton {
    private final CounterService counterService;

    public ControllerSingleton(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/count")
    public String getCount() {
        counterService.increment();
        return "Current count: " + counterService.getCount();
    }

    @GetMapping("/manual")
    public String useManualSingleton() {
        ManualSingleton s1 = ManualSingleton.getInstance();
        ManualSingleton s2 = ManualSingleton.getInstance();

        // This will return true
        boolean areSame = (s1 == s2);

        return "Are instances same? " + areSame;
    }
}
