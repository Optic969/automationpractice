import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class PracticeTest {

    public static WebDriver driver;
    Woman women = new Woman(driver);
    TShirts tShirts = new TShirts(driver);
    HomePage homepage = new HomePage(driver);
    Actions action = new Actions(driver);
    Dresses dresses = new Dresses(driver);
    Cart cart = new Cart(driver);
    static ChromeOptions options = new ChromeOptions();

    @BeforeClass
    public static void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        /*action = new Actions(driver);
        women = new Woman(driver);
        dresses = new Dresses(driver);
        tShirts = new TShirts(driver);
        cart = new Cart(driver);
        homepage = new HomePage(driver);*/
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    //@AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void ItemsTest(){
    women.getWomenItem();
    dresses.getDressesItem();
    tShirts.getTShirtsItem();
    cart.checkCartItems();
    homepage.searchItem();
    homepage.clickCheckBox(); 
    }

}
