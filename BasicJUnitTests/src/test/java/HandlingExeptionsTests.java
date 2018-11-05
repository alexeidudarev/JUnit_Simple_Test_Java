import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HandlingExeptionsTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void outOfBoundIndexTest(){
        new ArrayList<Object>().get(0);
    }
    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest(){
        int x = 10/0;
    }
    @Test(expected = AssertionError.class)
    public void assertionFailTest(){
        Assert.fail("just throw assertion fall method");
    }
}
