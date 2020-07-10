import com.codeborne.selenide.Configuration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = {
                "src/test/features/",
        },
        glue={"steps"})

public class PracticeTestCucumberRunner {

        public static WebDriver driver;

        @BeforeClass
        public static void setUp() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }

        @AfterClass
        public static void shutDown() {
                driver.quit();
        }

}
