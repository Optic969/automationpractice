package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Utils;

public class Woman {

    public WebDriver driver;

    public Woman (WebDriver driver) {
        this.driver = driver;
    }
    private String getWomenBtn = "//*[@id=\"block_top_menu\"]/ul/li[1]" ;
    private String getWomanProduct = "//*[@id=\"center_column\"]/ul/li[2]";
    private String getWomenCount = "//*[@id=\"center_column\"]/ul/li";
    //private String getWomenProductAttribute = "//dt[@class='first_item']//a[@class='cart_block_product_name'][contains(text(),'Blouse')]";
    private String getWomanAddToCartBtn = "//li[2]//div[1]//div[2]//div[2]//a[1]//span[1]";
    private String getContinueShopingBtn = "//span[@title=\"Continue shopping\"]";

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public void getWomenItem() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(getWomenBtn)).click();
        List<WebElement> itemsCount = driver.findElements(By.xpath(String.valueOf(getWomenCount)));
        Assert.assertEquals(itemsCount.size(),7);
        scrollToElement(driver.findElement(By.xpath(getWomanProduct)));
        scrollToElement(driver.findElement(By.xpath(getWomanAddToCartBtn)));
        driver.findElement(By.xpath(getWomanAddToCartBtn)).click();
        driver.findElement(By.xpath(getContinueShopingBtn)).click();
    }
}
