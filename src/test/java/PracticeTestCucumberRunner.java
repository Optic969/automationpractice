import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)





public class PracticeTestCucumberRunner {

    @BeforeClass
    public static void setUp() {
        //Configuration.startMaximized = true;
        //Configuration.timeout = 4000;
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browserSize = "1680x1024";
        Configuration.browserCapabilities.setCapability("enableVNC",true);
        if("true".equals(System.getProperty("video.enabled"))){
            Configuration.browserCapabilities.setCapability("enableVideo",true);
            Configuration.browserCapabilities.setCapability("videoFrameRate",24);
        }

    }

    /*@AfterClass
    public static void shutDown() {
        Selenide.closeWebDriver();
    }*/

        /*public static WebDriver driver;

        @BeforeClass
        public static void setUp() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }

        @AfterClass
        public static void shutDown() {
                driver.quit();
        }*/

}
