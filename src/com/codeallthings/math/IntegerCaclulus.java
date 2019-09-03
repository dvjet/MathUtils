package com.codeallthings.math;

public class IntegerCaclulus implements ICalculus {
    @Override
    public Number valueOf(String a) {
        return Integer.decode(a);
    }

    @Override
    public boolean lessOrEqual(Number a, Number b) {
        return a.intValue() <= b.intValue();
    }

    @Override
    public Number add(Number a, Number b) {
        return a.intValue() + b.intValue();
    }

    @Override
    public boolean divideWithRemainder(Number a, Number b) {
        return (a.intValue() % b.intValue() != 0);
    }
}
