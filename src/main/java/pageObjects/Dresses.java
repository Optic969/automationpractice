package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.Utils;

public class Dresses {

    public WebDriver driver;

    public Dresses (WebDriver driver) {
        this.driver = driver;
    }
    private String getDressesBtn = "//*[@id=\"block_top_menu\"]/ul/li[2]" ;
    private String getDressesProduct = "//*[@id=\"center_column\"]/ul/li[1]";
    private String getDressesCount = "//*[@id=\"center_column\"]/ul/li";
    //private String getDressesProductAttribute = "//dt[@class='item']//a[@class='cart_block_product_name'][contains(text(),'Printed Dress')]";
    private String getDressesAddToCartBtn = "//li[1]//div[1]//div[2]//div[2]//a[1]//span[1]";
    private String getContinueShopingBtn = "//span[@title=\"Continue shopping\"]";

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void getDressesItem() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(getDressesBtn)).click();
        List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getDressesCount)));
        Assert.assertEquals(itemsCount.size(),5);
        scrollToElement(driver.findElement(By.xpath(getDressesProduct)));
        scrollToElement(driver.findElement(By.xpath(getDressesAddToCartBtn)));
        driver.findElement(By.xpath(getDressesAddToCartBtn)).click();
        driver.findElement(By.xpath(getContinueShopingBtn)).click();

    }

}
