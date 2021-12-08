package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testVerifyEmailSent() {
        EmailSentPage emailSentPage = homePage.clickForgotPassword()
                .setEmailField("tau@example.com")
                .clickRetrieveButton();
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"));
    }
}
