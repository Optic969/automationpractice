package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Utils;

public class HomePage {

    public WebDriver driver;
    private String getSearchField = "//input[@name='search_query']" ;
    private String getSearchItem = "//button[@name='submit_search']";


    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public void searchItem() {
        scrollToElement(driver.findElement(By.xpath(getSearchField)));
        driver.findElement(By.xpath(getSearchField)).sendKeys("Blouse");
        driver.findElement(By.xpath(getSearchItem)).click();

    }
}
