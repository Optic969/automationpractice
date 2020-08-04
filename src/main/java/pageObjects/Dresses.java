package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Dresses {

    /*WebDriver driver;

    public Dresses (WebDriver driver) {
        this.driver = driver;
    }*/
    private SelenideElement getDressesBtn = $x("//*[@id=\"block_top_menu\"]/ul/li[2]");
    private SelenideElement getDressesProduct = $x("//*[@id=\"center_column\"]/ul/li[1]");
    //private SelenideElement getDressesCount = $x("//*[@id=\"center_column\"]/ul/li");
    private ElementsCollection getDressesCount = $$x("//*[@id=\"center_column\"]/ul/li");
    //private String getDressesProductAttribute = $x("//dt[@class='item']//a[@class='cart_block_product_name'][contains(text(),'Printed Dress')]");
    private SelenideElement getDressesAddToCartBtn = $x("//li[1]//div[1]//div[2]//div[2]//a[1]//span[1]");
    private SelenideElement getContinueShopingBtn = $x("//span[@title=\"Continue shopping\"]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/

    public void getDressesItem() {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getDressesBtn.click();
        /*List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getDressesCount)));
        Assert.assertEquals(itemsCount.size(),5);*/
        getDressesCount.shouldHave(size(5));
        //getDressesCount.shouldHave(size(8));
        getDressesProduct.hover();
        getDressesAddToCartBtn.hover();
        getDressesAddToCartBtn.click();
        getContinueShopingBtn.click();

    }

}
