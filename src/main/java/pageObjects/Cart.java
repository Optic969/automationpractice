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

public class Cart {

    WebDriver driver;

    public Cart (WebDriver driver) {
        this.driver = driver;
    }
    private String getCartBtn = "//b[contains(text(), \"Cart\")]/.." ;
    private String getCartProductDeleteX = "//dt[1]//a[@class=\"ajax_cart_block_remove_link\"]" ;
    private String getWomenProductAttribute = "//dt[@class='first_item']//a[@class='cart_block_product_name'][contains(text(),'Blouse')]";
    private String getDressesProductAttribute = "//dt[@class='item']//a[@class='cart_block_product_name'][contains(text(),'Printed Dress')]";
    private String getTShirtsProductAttribute = "//dt[@class='last_item']//a[@class='cart_block_product_name'][contains(text(),'Faded Shor...')]";

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public void checkCartItems() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        scrollToElement(driver.findElement(By.xpath(getCartBtn)));
        Assert.assertEquals(driver.findElement(By.xpath(getWomenProductAttribute)).getText(), "Blouse");
        Assert.assertEquals(driver.findElement(By.xpath(getDressesProductAttribute)).getText(), "Printed Dress");
        Assert.assertEquals(driver.findElement(By.xpath(getTShirtsProductAttribute)).getText(), "Faded Shor...");
        driver.findElement(By.xpath(getCartProductDeleteX)).click();
    }

}
