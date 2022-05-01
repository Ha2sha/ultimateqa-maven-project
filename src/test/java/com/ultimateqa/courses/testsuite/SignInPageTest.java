package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
        String actualText = signInPage.getWelcomeText();
        Assert.assertEquals("Sign In Link not working", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        signInPage.enterEmailID("abc@gmail.com");
        signInPage.enterPassword("abc123");
        signInPage.clickOnSignInButton();
        String expectedMsg = "Invalid email or password.";
        String actualMsg = signInPage.getErrorMessage();
        Assert.assertEquals("Enter Valid Credentials", expectedMsg, actualMsg);
    }

}
