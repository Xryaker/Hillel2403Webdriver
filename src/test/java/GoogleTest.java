import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends BaseClass {
    public static void main(String[] args) {
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Ukraine");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        WebElement element=driver.findElement(By.id("rso"));
        for(WebElement el: element.findElements(By.tagName("cite"))){
            System.out.println(el.getText());
        }
    }
}
