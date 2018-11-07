import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(value = Parameterized.class)


/*this class automatically created
**by ide
**to use this future tap on class name
**you want to make tests
**use Alt+Enter keys and choose create tests from menu
*/

public class CalculatorTest extends ParameterizedTest {
    private Calculator calculator = new Calculator();
    public CalculatorTest(int numA, int numB, int expected) {
        super(numA, numB, expected);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {5,2,3},
                {8,3,5},
                {14,5,9},
                {22,9,13}
        });
    }

    @Test
    public void add() {
        Assert.assertEquals(calculator.add(2,3),5);
    }

    @Test
    public void subtract() {
        Assert.assertThat(calculator.subtract(getNumA(),getNumB()), is (getExpected()));
    }
    @Ignore
    @Test
    public void devide() {
        //depricated
        Assert.assertEquals(calculator.devide(4,0),0);
    }

    @Test
    public void multy() {
        Assert.assertEquals(5,7,35);
    }
}