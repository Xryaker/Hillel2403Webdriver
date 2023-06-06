import config.BaseClass;
import magig.HillelUrls;
import org.junit.After;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;


public class TestMAinPageFunction extends BaseClass {
    private static MainPageObject mainPage;
    static private String mainUrl = "https://ithillel.ua/";


    @BeforeClass
    public static void befortest() {
        driver.get(mainUrl);
        mainPage = new MainPageObject(driver);
    }

    @After
    public void afTest() {
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }

    @Test
    public void test1() throws Exception {
        mainPage.getConsultationButton().click();
        assertTrue(mainPage.isEnabledFormConsultayion());

    }

    @Test
    public void test2() {
        mainPage.getContactsButton().click();
        assertEquals(HillelUrls.CONTACT_URL, driver.getCurrentUrl());
    }

}
