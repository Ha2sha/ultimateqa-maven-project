package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//li[@role='alert']");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterEmailID(String email){
      sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
      sendTextToElement(passwordField,password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }


}
