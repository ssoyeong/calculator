package com.george.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator Spring Application. */
@Service
public class Calculator {
    @Cacheable
    public int sum(int a, int b) {
        return a + b;
    }
}
