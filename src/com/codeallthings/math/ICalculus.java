package com.codeallthings.math;

public interface ICalculus {
    Number valueOf(String a);
    boolean lessOrEqual(Number a, Number b);
    Number add(Number a, Number b);
    boolean divideWithRemainder(Number a, Number b);
}
