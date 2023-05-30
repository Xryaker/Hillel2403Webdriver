import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestHillel extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://dnipro.ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        WebElement consultButton=driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(consultButton.getText());
        consultButton.click();
        System.out.println(driver.findElement(By.className("section-content_descriptor")).getText());
        Thread.sleep(5000);
        driver.quit();

    }
}
