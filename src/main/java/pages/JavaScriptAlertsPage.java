package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.xpath("//button[text()='Click for JS Alert']");
    private By confirmAlertButton=By.xpath("//button[text()='Click for JS Confirm']");

    private By result=By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void confirmAlert(){
        driver.findElement(confirmAlertButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToCancel(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
