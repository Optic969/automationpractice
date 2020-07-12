package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TShirts {

    /*WebDriver driver;

    public TShirts (WebDriver driver) {
        this.driver = driver;
    }*/
    private SelenideElement getTShirtsBtn = $x("//*[@id=\"block_top_menu\"]/ul/li[3]") ;
    private SelenideElement getTShirtsProduct = $x("//*[@id=\"center_column\"]/ul/li[1]");
    //private SelenideElement getTShirtsCount = $x("//*[@id=\"center_column\"]/ul/li");
    private ElementsCollection getTShirtsCount = $$x("//*[@id=\"center_column\"]/ul/li");
    //private String getTShirtsProductAttribute = $x("//dt[@class='last_item']//a[@class='cart_block_product_name'][contains(text(),'Faded Shor...')]");
    private SelenideElement getTShirtsAddToCartBtn = $x("//li[1]//div[1]//div[2]//div[2]//a[1]//span[1]");
    private SelenideElement getContinueShopingBtn = $x("//span[@title=\"Continue shopping\"]");

    /*public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }*/
    public void getTShirtsItem() {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getTShirtsBtn.click();
        /*List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getTShirtsCount)));
        Assert.assertEquals(itemsCount.size(),1);*/
        getTShirtsCount.shouldHave(size(1));
        getTShirtsProduct.scrollTo();
        getTShirtsAddToCartBtn.scrollTo();
        getTShirtsAddToCartBtn.click();
        getContinueShopingBtn.click();
    }
}

