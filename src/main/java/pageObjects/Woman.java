package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class Woman {

    /*WebDriver driver;

    public Woman (WebDriver driver) {
        this.driver = driver;
    }*/


    private String baseURL = "http://automationpractice.com/index.php";

    //Locators
    private SelenideElement getWomenBtn = $x("//*[@id=\"block_top_menu\"]/ul/li[1]") ;
    private SelenideElement getWomanProduct = $x("//*[@id=\"center_column\"]/ul/li[2]");
    //private SelenideElement getWomenCount = $x("//*[@id=\"center_column\"]/ul/li");
    private ElementsCollection getWomenCount = $$x("//*[@id=\"center_column\"]/ul/li");
    //private SelenideElement getWomenProductAttribute = $x("//dt[@class='first_item']//a[@class='cart_block_product_name'][contains(text(),'Blouse')]");
    private SelenideElement getWomanAddToCartBtn = $x("//li[2]//div[1]//div[2]//div[2]//a[1]//span[1]");
    private SelenideElement getContinueShopingBtn = $x("//span[@title=\"Continue shopping\"]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/
    public void getWomenItem() {
        Selenide.open(baseURL);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getWomenBtn.click();
        //List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getWomenCount)));
        //Assert.assertEquals(itemsCount.size(),7);
        getWomenCount.shouldHave(size(7));
        getWomanProduct.hover();
        getWomanAddToCartBtn.hover();
        getWomanAddToCartBtn.click();
        getContinueShopingBtn.click();
    }
}
