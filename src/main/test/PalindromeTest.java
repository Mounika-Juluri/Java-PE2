import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindromeCheck;

    @Before
    public void setUp() {
        palindromeCheck=new Palindrome();
    }

    @After
    public void tearDown() {

        palindromeCheck=null;
    }

    @Test
    public void numberPalindromeSuccess() {
        String expectedValue="Input is a Palindrome";
        String actualValue=palindromeCheck.stringPalindrome("23432");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void notPalindromeFailure(){
        String expectedValue="Input is not a Palindrome";
        String actualValue=palindromeCheck.stringPalindrome("5478");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void negativePalindromeFailure(){
        String expectedValue="Input is not a Palindrome";
        String actualValue=palindromeCheck.stringPalindrome("-10");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void stringPalindromeSuccess() {
        String expectedValue="Input is a Palindrome";
        String actualValue=palindromeCheck.stringPalindrome("nun");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void stringPalindromeFaliure() {
        String expectedValue="Input is not a Palindrome";
        String actualValue=palindromeCheck.stringPalindrome("none");
        assertEquals(expectedValue,actualValue);
    }

}