package com.codeallthings.math;

public class MathUtils {
    public static void main(String[] args) {
        IMultiples multiples = MultiplesFactory.createMultiples(args);
        if (multiples != null) multiples.execute();
    }
}
