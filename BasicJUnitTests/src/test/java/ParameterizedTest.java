import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(value = Parameterized.class)

public class ParameterizedTest {
    private int numA;
    private int numB;
    private int expected;

    public ParameterizedTest(int numA, int numB, int expected) {
        this.numA = numA;
        this.numB = numB;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {2,3,5},
                {4,5,9},
                {4,9,13}
        });
    }
    @Test
    public void testAddTwoNumbers(){
        Assert.assertThat(MathSampleUtils.add(numA,numB),is(expected));
    }

    public int getNumA() {
        return numA;
    }

    public int getNumB() {
        return numB;
    }

    public int getExpected() {
        return expected;
    }
}
