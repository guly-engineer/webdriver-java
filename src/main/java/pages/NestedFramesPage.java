package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText() {
        String topFrame = "frame-top";
        String leftFrame = "frame-left";
        driver.switchTo().frame(topFrame).switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame(); //exit top to main
        return text;
    }

    public String getBottomFrameText() {
        String bottomFrame = "frame-bottom";
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    private String getFrameText() {
        return driver.findElement(body).getText();
    }
}
