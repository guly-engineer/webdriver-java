package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
       // driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375,812));
//        driver.findElement(By.linkText("Shifting Content")).click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> menuItems=driver.findElements(By.tagName("li"));
//        System.out.println("Number of menu items: "+menuItems.size());
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    We do not need this main method anymore because test ng knows what to run (anotations)
//    public static void main(String[] args) {
//        BaseTests test=new BaseTests();
//        test.setUp();
//    }
}
