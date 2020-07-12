package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    /*WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }*/

    private SelenideElement getSearchField = $x("//input[@name='search_query']");
    private SelenideElement getSearchItem = $x("//button[@name='submit_search']");
    private SelenideElement getCheckbox = $x("//input[@name='layered_category_4']");
    private SelenideElement getBreadcrumbWoman = $x("//div[@class='breadcrumb clearfix']//a[contains(text(),'Women')]");
    private SelenideElement getWomenBtn = $x("//*[@id=\"block_top_menu\"]/ul/li[1]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/
    public void searchItem() {
        //scrollToElement(getSearchField);
        getSearchItem.scrollTo();
        getSearchField.sendKeys("Blouse");
        getSearchItem.click();
    }
    public void clickCheckBox(){
        getWomenBtn.click();
        getCheckbox.click();

    }
}
