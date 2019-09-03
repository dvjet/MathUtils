package com.codeallthings.math;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesTest {

    @Test
    public void test_isNumeric_Integer()
    {
        Assert.assertTrue(Multiples.isNumeric("123"));
    }

    @Test
    public void test_IsNumeric_Float() {
        Assert.assertTrue(Multiples.isNumeric("123"));
    }

    @Test
    public void test_IsNumeric_Null() {
        Assert.assertFalse(Multiples.isNumeric(null));
    }

    @Test
    public void test_IsNumeric_Empty() {
        Assert.assertFalse(Multiples.isNumeric(""));
    }

    @Test
    public void test_IsNumeric_Blank() {
        Assert.assertFalse(Multiples.isNumeric(" "));
    }

    @Test
    public void test_IsNumeric_Invalid() {
        Assert.assertFalse(Multiples.isNumeric("Dummy"));
    }

    @Test
    public void test_IsValidArgs_Null() {
        Assert.assertEquals("ERROR: No arguments", Multiples.IsValidArgs(null));
    }

    @Test
    public void test_IsValidArgs_Empty() {
        Assert.assertEquals("ERROR: No arguments", Multiples.IsValidArgs(new String[]{}));
    }

    @Test
    public void test_IsValidArgs_WrongNumberArgs() {
        Assert.assertEquals("ERROR: Wrong number of arguments", Multiples.IsValidArgs(new String[]{"a", "b"}));
    }

    @Test
    public void test_IsValidArgs_NullArgument() {
        Assert.assertEquals("ERROR: One of arguments is null", Multiples.IsValidArgs(new String[]{"10", "20", null, "5", "10"}));
    }

    @Test
    public void test_IsValidArgs_EmptyArgument() {
        Assert.assertEquals("ERROR: One of arguments is empty", Multiples.IsValidArgs(new String[]{"10", "20", "", "5", "10"}));
    }

    @Test
    public void test_IsValidArgs_NotNumberArgument() {
        Assert.assertEquals("ERROR: One of arguments is not numeric", Multiples.IsValidArgs(new String[]{"10", "20", "Dummy", "5", "10"}));
    }

    @Test
    public void test_IsValidArgs_WrongBound() {
        Assert.assertEquals("ERROR: Wrong bound limits", Multiples.IsValidArgs(new String[]{"20", "10", "4", "5", "10"}));
    }

    @Test
    public void test_IsValidArgs_ExceedLimit() {
        Assert.assertEquals("ERROR: Output number exceed Max output number", Multiples.IsValidArgs(new String[]{"10", "20", "4", "5", "102"}));
    }

}
