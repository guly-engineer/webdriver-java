package ForgotPassword;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testVerifyEmailSent(){
        EmailSentPage emailSentPage = homePage.clickForgotPassword()
                .setEmailField("tau@example.com")
                .clickRetrieveButton();
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"));
    }


}
