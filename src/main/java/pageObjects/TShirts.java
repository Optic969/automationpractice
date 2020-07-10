package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

public class TShirts {

    public WebDriver driver;

    public TShirts (WebDriver driver) {
        this.driver = driver;
    }
    private String getTShirtsBtn = "//*[@id=\"block_top_menu\"]/ul/li[3]" ;
    private String getTShirtsProduct = "//*[@id=\"center_column\"]/ul/li[1]";
    private String getTShirtsCount = "//*[@id=\"center_column\"]/ul/li";
    //private String getTShirtsProductAttribute = "//dt[@class='last_item']//a[@class='cart_block_product_name'][contains(text(),'Faded Shor...')]";
    private String getTShirtsAddToCartBtn = "//li[1]//div[1]//div[2]//div[2]//a[1]//span[1]";
    private String getContinueShopingBtn = "//span[@title=\"Continue shopping\"]";

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public void getTShirtsItem() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(getTShirtsBtn)).click();
        List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getTShirtsCount)));
        Assert.assertEquals(itemsCount.size(),1);
        scrollToElement(driver.findElement(By.xpath(getTShirtsProduct)));
        scrollToElement(driver.findElement(By.xpath(getTShirtsAddToCartBtn)));
        driver.findElement(By.xpath(getTShirtsAddToCartBtn)).click();
        driver.findElement(By.xpath(getContinueShopingBtn)).click();
    }
}

