import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreSomeTest {
    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest(){
        int x = 10/0;
    }
    @Ignore("this is a method i dont want to test")
    @Test(expected = AssertionError.class)
    public void assertionFailTest(){
        Assert.fail("just throw assertion fall method");
    }
}
