package com.codeallthings.math;

import org.junit.Assert;
import org.junit.Test;

public class IntegerCalculusTest {

    ICalculus calculus = new IntegerCaclulus();

    @Test
    public void test_Add() {
        Assert.assertEquals(5, calculus.add(3, 2));
    }

    @Test
    public void test_LessOrEqual() {
        Assert.assertTrue(calculus.lessOrEqual(4, 5));
        Assert.assertTrue(calculus.lessOrEqual(4, 4));
        Assert.assertFalse(calculus.lessOrEqual(5, 4));
    }

    @Test
    public void test_divideWithRemainder() {
        Assert.assertTrue(calculus.divideWithRemainder(9, 2));
        Assert.assertTrue(calculus.lessOrEqual(2, 4));
        Assert.assertFalse(calculus.lessOrEqual(8, 2));

    }

}
