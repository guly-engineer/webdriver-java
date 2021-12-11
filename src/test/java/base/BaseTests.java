package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;

import java.io.File;
import java.io.IOException;


public class BaseTests {

    public WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriverListener listener = new EventReporter();
        driver = new EventFiringDecorator(listener).decorate(new ChromeDriver());
        goHome();
        //driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375,812));
//        driver.findElement(By.linkText("Shifting Content")).click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> menuItems=driver.findElements(By.tagName("li"));
//        System.out.println("Number of menu items: "+menuItems.size());


    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/"
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public CookieManager getCookieManager() {
        return new CookieManager(driver);
    }
//    We do not need this main method anymore because test ng knows what to run (anotations)
//    public static void main(String[] args) {
//        BaseTests test=new BaseTests();
//        test.setUp();
//    }
}
