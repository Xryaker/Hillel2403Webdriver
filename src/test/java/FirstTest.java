import config.BaseClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import util.Util;

import java.util.Set;

public class FirstTest extends BaseClass {
    static String mainUrl="https://dnipro.ithillel.ua/";
    By consultaButton=By.id("btn-consultation-hero");
    By agreement=By.xpath("//*[@id=\"form-consultation\"]//footer//a[@target=\"_blank\"]");

    @BeforeClass
    public static void bFirstTest(){
        driver.get(mainUrl);
    }
    @Before
    public void beforeM(){
        if(!driver.getCurrentUrl().equals(mainUrl)){
            driver.navigate().to(mainUrl);
        }
    }

    @Test
    public  void test1() throws InterruptedException {
    driver.findElement(consultaButton).click();
    String win=driver.getWindowHandle();

    driver.findElement(agreement).click();
    Thread.sleep(2000);
    driver.switchTo().window(win);
//        Set<String> stringSet=driver.getWindowHandles();
//        for (String s : stringSet) {
//            driver.switchTo().window(s);
//            if (driver.getTitle().contains("Hillel")){
//                break;
//            }
//        }
    }
    @Test
    public void test2(){
        driver.findElement(consultaButton).click();
        assertFalse(driver.findElement(By.id("form-consultation")).isEnabled());
    }


}
