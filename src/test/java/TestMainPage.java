import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;

public class TestMainPage extends BaseClass {
    private static MainPageObject mainPage;
    @BeforeClass
    public static void befortest(){
        driver.get("https://ithillel.ua/");
        mainPage=new MainPageObject(driver);
    }
    @Test
    public void test1(){
        System.out.println(mainPage.getConsultationButton().getText());
    }

}
