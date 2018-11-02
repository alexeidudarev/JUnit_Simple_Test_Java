import org.junit.Assert;
import org.junit.Test;

public class AssertionBasicTests {
    Calculator calculator = new Calculator();
    @Test
    public void integersEqualityTest(){
        int expected = 10;
        int result = calculator.add(8,2);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void arraysEqualityTest(){
        int expected = 10;
        int [] arr = {1,2,3};
        int [] arr2 = {1,2,3};
        Assert.assertArrayEquals("array arnt equal",arr,arr2);
    }
    @Test
    public void booleaEqualityTest(){
        boolean expected = true;
        boolean excpectedfalse = false;
        Assert.assertTrue("expected true, but found false value",true);
        Assert.assertFalse(excpectedfalse);
    }
    @Test
    public void asserEqualsTest(){
        Assert.assertEquals("not the same values","cat","cat");
    }

}
