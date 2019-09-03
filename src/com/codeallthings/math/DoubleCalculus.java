package com.codeallthings.math;

public class DoubleCalculus implements ICalculus {
    @Override
    public Number valueOf(String a) {
        return Double.valueOf(a);
    }

    @Override
    public boolean lessOrEqual(Number a, Number b) {
        return a.doubleValue() <= b.doubleValue();
    }

    @Override
    public Number add(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    @Override
    public boolean divideWithRemainder(Number a, Number b) {
        return (a.doubleValue() % b.doubleValue()) != 0.0;
    }
}
