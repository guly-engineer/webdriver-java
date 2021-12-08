package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        String expectedResult = "You successfully clicked an alert";
        var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.triggerAlert();
        JavaScriptAlertsPage.alert_clickToAccept();
        assertEquals(expectedResult, JavaScriptAlertsPage.getResult());
        // System.out.println(JavaScriptAlertsPage.getResult());
    }
    @Test
    public void testCancelConfirmAlert() {
        String expectedResult = "You clicked: Cancel";
        String expectedText = "I am a JS Confirm";

        var AlertsPage = homePage.clickJavaScriptAlerts();
        AlertsPage.confirmAlert();
        String actualText=AlertsPage.alert_getText();
        AlertsPage.alert_clickToCancel();
        assertEquals(expectedText, actualText);
        assertEquals(expectedResult, AlertsPage.getResult());
        System.out.println(AlertsPage.getResult());
    }
}
