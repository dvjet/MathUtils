package com.codeallthings.math;

class MultiplesFactory {
    public static IMultiples createMultiples(String[] args) {
        String error = Multiples.IsValidArgs(args);
        if (error != null) {
            System.out.println(error);
            return null;
        }
        ICalculus calculus = Multiples.isInteger(args) ? new IntegerCaclulus() : new DoubleCalculus();
        return new Multiples(calculus, args);
    }
}
