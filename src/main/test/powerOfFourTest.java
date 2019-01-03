import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class powerOfFourTest {

    powerOfFour pof;

    @Before
    public void setUp() {
        pof= new powerOfFour();
    }

    @After
    public void tearDown() {
        pof=null;
    }

    @Test
    public void numberSuccess() {
        String expectedValue="Input is power of four";
        String actualValue=pof.checkPower(64);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void numberFailure() {
        String expectedValue="Input is not power of four";
        String actualValue=pof.checkPower(10);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void negativeValueFailure() {
        String expectedValue="Input is not power of four";
        String actualValue=pof.checkPower(-12);
        assertEquals(expectedValue,actualValue);
    }

}