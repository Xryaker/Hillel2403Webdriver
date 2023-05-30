import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WikiTest extends BaseClass {
    static By wikiLink = new By.ById("Welcome_to_Wikipedia"),
    listTabs=new By.ByXPath("//li[contains(@class,\"vector-tab-noicon\") and contains(@class,\"mw-list-item\")]");
    static String url = "https://en.wikipedia.org/wiki/Main_Page";


    public static void main(String[] args) throws InterruptedException {
        driver.get(url);

        WebElement webElement= driver.findElement(wikiLink);
        System.out.println("link from href "+webElement.findElement(By.tagName("a")).getAttribute("href"));
        System.out.println("text from attribute title "+webElement.findElement(By.tagName("a")).getAttribute("title"));
        System.out.println("text from element "+webElement.findElement(By.tagName("a")).getText());
        List<WebElement> webElementList=driver.findElements(listTabs);
        for (WebElement element : webElementList) {
            System.out.print(element.getText()+"  ");
            System.out.println(element.findElement(By.tagName("a")).getAttribute("href"));
        }
        (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement_id"))).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
