package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenu=By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {this.driver=driver;    }
    public void rightClickBox(){
        Actions action=new Actions(driver);
        action.contextClick(driver.findElement(contextMenu)).perform();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

}
