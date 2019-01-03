import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static jdk.vm.ci.code.CodeUtil.isEven;
import static org.junit.Assert.*;

public class EvenNumTestTest {


    @Test
    public void evenNumberSuccess() {
        Boolean expectedValue=true;
        Boolean actualValue=isEven(24);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void NumberFailure() {
        Boolean expectedValue=false;
        Boolean actualValue=isEven(27);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void evenNegativeNumberSuccess() {
        Boolean expectedValue=false;
        Boolean actualValue=isEven(-26);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void oddNegativeNumberFailure() {
        Boolean expectedValue=false;
        Boolean actualValue=isEven(-27);
        assertEquals(expectedValue,actualValue);
    }

}