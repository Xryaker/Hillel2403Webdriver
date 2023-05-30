import com.google.common.annotations.VisibleForTesting;
import config.BaseClass;
import config.TestBase;
import org.junit.*;

public class homeTest extends TestBase {

    @BeforeClass
    public static void startM(){
        System.out.println("Before Class");
    }

    @Before
    public void bMethod(){
        System.out.println("Befor Method");
    }
    @After
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test
    public void hometest() {
        System.out.println("Test method 1");
    }

    @Test
    public void hometest1() {
        System.out.println("Test method 2");
    }

    @AfterClass
    public static void afterM(){
        System.out.println("After Class");
    }
}
