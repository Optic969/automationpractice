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

    private WebDriver driver;
    Woman women;
    TShirts tShirts;
    HomePage homepage;
    Actions action;
    Dresses dresses;
    Cart cart;
    ChromeOptions options = new ChromeOptions();

    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        action = new Actions(driver);
        women = new Woman(driver);
        dresses = new Dresses(driver);
        tShirts = new TShirts(driver);
        cart = new Cart(driver);
        homepage = new HomePage(driver);
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        String baseUrl = "http://automationpractice.com/index.php";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    //@After
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
    }

}
