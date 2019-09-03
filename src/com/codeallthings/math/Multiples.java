package com.codeallthings.math;

class Multiples extends  MultiplesBase implements IMultiples{

    private Number lower_Bound;
    private Number upper_Bound;
    private Number alpha_Multiple;
    private Number beta_Multiple;
    private int output_Limit;

    public static int INCREMENTOR = 1;
    public static int MAX_OUTPUT_NUMBER = 100;
    public static String ALPHA_OUTPUT = "Alpha";
    public static String BETA_OUTPUT = "Beta";

    public Multiples(ICalculus calculus, String[] args) {
        super(calculus);
        this.lower_Bound = calculus.valueOf(args[0]);
        this.upper_Bound = calculus.valueOf(args[1]);
        this.alpha_Multiple = calculus.valueOf(args[2]);
        this.beta_Multiple = calculus.valueOf(args[3]);
        this.output_Limit = Integer.parseInt(args[4]);
    }

    public static String IsValidArgs(String[] args) {
        if (args == null || args.length == 0)
            return "ERROR: No arguments";
        if (args.length != 5)
            return "ERROR: Wrong number of arguments";

        for (String arg : args) {
            if (arg == null)
                return "ERROR: One of arguments is null";
            if (arg.isEmpty())
                return "ERROR: One of arguments is empty";
            if (!isNumeric(arg))
                return "ERROR: One of arguments is not numeric";
        }

        // Check bound
        Double lower_bound = Double.parseDouble(args[0]);
        Double upper_bound = Double.parseDouble(args[1]);
        if (lower_bound > upper_bound)
            return "ERROR: Wrong bound limits";

        // Check max output number
        Double output_number = Double.parseDouble(args[4]);
        if (output_number > MAX_OUTPUT_NUMBER)
            return "ERROR: Output number exceed Max output number";

        return null;
    }

    public static boolean isNumeric(String str) {
        try {
            Double number = Double.parseDouble(str);
            return true;
        } catch (Exception ex) {}
        return false;
    }

    public static boolean isInteger(String[] args) {
        for (String arg : args) {
            if (!isInteger(arg))
                return false;
        }
        return true;
    }

    public static boolean isInteger(String str) {
        try {
            Integer number = Integer.parseInt(str);
            return true;
        } catch (Exception ex) {}
        return false;
    }

    @Override
    public void execute() {

        Number next = lower_Bound;
        for (int i = 0; i < output_Limit; i += INCREMENTOR ) {
            if (!calculus.lessOrEqual(next, upper_Bound)) {
                break;
            }

            StringBuilder output = new StringBuilder();
            output.append(next.toString() + ": ");

            if (!calculus.divideWithRemainder(next, alpha_Multiple))
                output.append(ALPHA_OUTPUT);

            if (!calculus.divideWithRemainder(next, beta_Multiple))
                output.append(BETA_OUTPUT);

            System.out.println(output.toString());

            next = calculus.add(next, INCREMENTOR);
        }

    }
}
