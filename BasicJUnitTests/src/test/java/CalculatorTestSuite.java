import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        HandlingExeptionsTests.class,
        MathSampleUtils.class
})

public class CalculatorTestSuite {
    @BeforeClass
    public static void setUpClass(){

    }
    @AfterClass
    public static void tearDown(){

    }
}
