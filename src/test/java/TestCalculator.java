import org.junit.Assert;
import org.junit.Test;
import practice8.operations.Div;
import practice8.operations.Multi;
import practice8.operations.Sub;
import practice8.operations.Sum;

import java.util.InputMismatchException;


public class TestCalculator {

    @Test
    public void testSub() {
        Sub testSub = new Sub();
        int n1 = testSub.subtraction(6,3);
        Assert.assertEquals(3, n1);

    }
    @Test
    public void testSum() {
        Sum testSum = new Sum();
        int n2 = testSum.sum(2,2);
        Assert.assertEquals(4, n2);
    }
    @Test
    public void testMulti() {
        Multi testMulti = new Multi();
        int n3 = testMulti.multiplication(5, 7);
        Assert.assertEquals(35, n3);
    }


    @Test
    public void testDiv() {
        Div testDiv = new Div();
        int n4 = testDiv.division(10, 2);
        Assert.assertEquals(5, n4);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivByZero() {
        Div testDiv = new Div();
        testDiv.division(10, 0);
    }
}
