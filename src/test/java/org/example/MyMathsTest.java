package org.example;

import org.junit.Before;
import org.junit.Test;

public class MyMathsTest {

    private MyMaths maths;

    @Before
    public void setUp(){
        maths = new MyMaths();
    }

    @Test
    public void testGcdStatementCoverage(){
        maths.gcd(2,7);
    }

    @Test
    public void testGcdBranchCoverage(){
        maths.gcd(4, 3);
    }

}
