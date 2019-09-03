package com.codeallthings.math;

import mockit.*;
import mockit.integration.junit4.JMockit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.PrintStream;

@RunWith(JMockit.class)
public class MathUtilsTest {

    @Test
    public void test_Case_1A(@Mocked PrintStream printStream) {
        System.setOut(printStream);

        new Expectations() {{
            printStream.println("1: "); times = 1;
            printStream.println("2: Alpha"); times = 1;
            printStream.println("3: Beta"); times = 1;
            printStream.println("4: Alpha"); times = 1;
            printStream.println("5: "); times = 1;
            printStream.println("6: AlphaBeta"); times = 1;
            printStream.println("7: "); times = 1;
            printStream.println("8: Alpha"); times = 1;
            printStream.println("9: Beta"); times = 1;
            printStream.println("10: Alpha"); times = 1;
        }};

        MathUtils.main(new String[] {"1", "10", "2", "3", "50"});
    }

    @Test
    public void test_Case_1B(@Mocked PrintStream printStream) {
        System.setOut(printStream);

        new Expectations() {{
            printStream.println("300: Alpha"); times = 1;
            printStream.println("301: Beta"); times = 1;
            printStream.println("302: "); times = 1;
            printStream.println("303: "); times = 1;
            printStream.println("304: "); times = 1;
            printStream.println("305: Alpha"); times = 1;
            printStream.println("306: "); times = 1;
            printStream.println("307: "); times = 1;
            printStream.println("308: Beta"); times = 1;
            printStream.println("309: "); times = 1;
        }};

        MathUtils.main(new String[] {"300", "500", "5", "7", "10"});
    }

    @Test
    public void test_Case_2A(@Mocked PrintStream printStream) {
        System.setOut(printStream);

        new Expectations() {{
            printStream.println("6.2: "); times = 1;
            printStream.println("7.2: Alpha"); times = 1;
            printStream.println("8.2: Beta"); times = 1;
            printStream.println("9.2: "); times = 1;
        }};

        MathUtils.main(new String[] {"6.2", "1E1", "3.6", "4.1", "10"});
    }

    @Test
    public void test_Case_2B(@Mocked PrintStream printStream) {
        System.setOut(printStream);

        new Expectations() {{
            printStream.println("10: Alpha"); times = 1;
            printStream.println("11: "); times = 1;
            printStream.println("12: AlphaBeta"); times = 1;
            printStream.println("13: "); times = 1;
            printStream.println("14: Alpha"); times = 1;
        }};

        MathUtils.main(new String[] {"10", "20", "2", "3", "5"});
    }

    @Test
    public void test_Case_2C(@Mocked PrintStream printStream) {
        System.setOut(printStream);

        new Expectations() {{
            printStream.println("10.0: Alpha"); times = 1;
            printStream.println("11.0: "); times = 1;
            printStream.println("12.0: Beta"); times = 1;
            printStream.println("13.0: "); times = 1;
            printStream.println("14.0: "); times = 1;
            printStream.println("15.0: AlphaBeta"); times = 1;
        }};

        MathUtils.main(new String[] {"10", "20", "2.5", "3", "7"});
    }

}
