import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertionBasicTests.class,
        ThrowingExeptionTests.class,
        })

public class SuiteTest {

    @BeforeClass
    public static void setUpClass(){

    }
    @AfterClass
    public static void tearDown(){

    }
}
