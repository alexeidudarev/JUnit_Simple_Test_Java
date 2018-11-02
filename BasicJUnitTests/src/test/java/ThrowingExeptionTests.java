import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThrowingExeptionTests {

    @Test
    public void assertSameTest(){
        Integer num = Integer.valueOf(62);
        Assert.assertSame("object is null",num,num);
    }
    @Test
    public void assertNotSameTest(){
        Assert.assertNotSame("object not same",new Object(),new ArrayList<>());
    }
    @Test
    public void assertNullTest(){
        Assert.assertNull("object is null",null);
    }
    @Test
    public void assertNotNullTest(){
        Assert.assertNotNull("object is null",new Object());
    }
//    @Test
//    public void assertionFailTest(){
//        Assert.fail("just throw assertion fall method");
//    }
}
