package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField=By.id("email");
    private By buttonRetrievePassword=By.id("form_submit");


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public ForgotPasswordPage setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public EmailSentPage clickRetrieveButton(){
        driver.findElement(buttonRetrievePassword).click();
        return new EmailSentPage(driver);
    }

}
