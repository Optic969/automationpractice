package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class HomePage {

    WebDriver driver;
    private String getSearchField = "//input[@name='search_query']" ;
    private String getSearchItem = "//button[@name='submit_search']";
    private String getCheckbox = "//input[@name='layered_category_4']";
    private String getBreadcrumbWoman =  "//div[@class='breadcrumb clearfix']//a[contains(text(),'Women')]";
    private String getWomenBtn = "//*[@id=\"block_top_menu\"]/ul/li[1]" ;

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
    public void clickCheckBox(){
        driver.findElement(By.xpath(getWomenBtn)).click();
        driver.findElement(By.xpath(getCheckbox)).click();

    }
}
