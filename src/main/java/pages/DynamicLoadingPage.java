package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {this.driver=driver;    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        return new DynamicLoadingExample2Page(driver);
    }
}
