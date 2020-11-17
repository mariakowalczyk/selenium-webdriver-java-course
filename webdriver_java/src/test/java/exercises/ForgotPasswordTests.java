package exercises;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("mkow@accenture.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrivePasswordButton();
        assertTrue(emailSentPage.getAlertText().contains("Your e-mail's been sent!"), "Alert text is incorrect");
    }
}
