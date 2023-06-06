package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    @FindBy(xpath = "//button[contains(@class,\"btn-consultation\") and contains(@class,\"contacts-item_btn\")]")
    WebElement consultationButton;

    @FindBy(id = "form-consultation")
    WebElement formConsult;

    @FindBy(xpath = "//li[@class=\"socials-list_item\"]")
    List<WebElement> socialsList;

//    private WebDriver driver;
//
//    public MainPageFactory(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    public boolean isEnabledFormConsultayion() {
        return formConsult.isEnabled();
    }

    public List<String> getSocialsLinks(){
        List<String> stringList=new ArrayList<>();
        for (WebElement element : socialsList) {
           stringList.add(element.findElement(By.tagName("a")).getAttribute("href"));
        }
        return stringList;
    }

}
