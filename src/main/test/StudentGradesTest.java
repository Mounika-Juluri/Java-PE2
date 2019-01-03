import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    int intArray[];
    StudentGrades studentInfo;

    @Before
    public void setUp() {
        studentInfo=new StudentGrades();
        intArray = new int[4];
    }

    @After
    public void tearDown()  {
        studentInfo=null;
        intArray=null;
    }
    @Test
    public void minValueSuccess(){
        int intArray[]={80,0,54,78};
        String expectedValue="Minimum value=0";
        String actualValue=minValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void maxValueSuccess(){
        int intArray[]={80,0,54,100};
        String expectedValue="Maximum value=100";
        String actualValue=maxValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void avgValueSuccess(){
        int intArray[]={50,60,70,80};
        String expectedValue="Average value=65";
        String actualValue=avgValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void minValueFailure(){
        int intArray[]={80,0,54,-1};
        String expectedValue="Invalid Input";
        String actualValue=minValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void maxValueFailure(){
        int intArray[]={80,105,54,100};
        String expectedValue="Invalid Input";
        String actualValue=maxValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void avgValueFailure(){
        int intArray[]={50,60,70,-250};
        String expectedValue="Invalid Input";
        String actualValue=avgValueCal(intArray);
        assertEquals(expectedValue,actualValue);
    }

}