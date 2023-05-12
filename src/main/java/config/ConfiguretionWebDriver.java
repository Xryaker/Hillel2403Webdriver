package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfiguretionWebDriver {
    public static void main(String[] args) throws InterruptedException {
        URL mainUrl=null;
        try {
           mainUrl=new URL("https://dnipro.ithillel.ua/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to(mainUrl);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
