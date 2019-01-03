import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial fact;

    @Before
    public void setUp() {
        fact=new Factorial();
    }

    @After
    public void tearDown() {
        fact=null;
    }

    @Test
    public void factorialLimitSuccess() {
        String expectedValue="The factorial of 5 is 120";
        String actualValue=fact.factorialLimit(5);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void factorialLimitFailure() {
        String expectedValue="The factorial of 13 is out of range";
        String actualValue=fact.factorialLimit(13);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void factorialLongLimitSuccess() {
        String expectedValue="The factorial of 20 is is 2432902008176640000";
        String actualValue=fact.factorialLongLimit(20);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void factorialLongLimitFailure() {
        String expectedValue="The factorial of 21 is out of range";
        String actualValue=fact.factorialLongLimit(21);
        assertEquals(expectedValue,actualValue);
    }
}