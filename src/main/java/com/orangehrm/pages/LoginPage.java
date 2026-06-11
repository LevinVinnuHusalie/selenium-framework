package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.actiondriver.ActionDriver;

public class LoginPage {
    private ActionDriver actionDriver;

    private By usernameField = By.name("username");
    private By passwordField = By.cssSelector("input[type='password']");
    private By loginButton = By.xpath("//button[text()= ' Login ']");
    private By errorMessage = By.xpath("//p[text()='Invalid credentials']");

    public LoginPage(WebDriver driver) {
        this.actionDriver = new ActionDriver(driver);
    }

    public void login(String username, String password) {
        actionDriver.enterText(usernameField, username);
        actionDriver.enterText(passwordField, password);
        actionDriver.click(loginButton);
    }

    public boolean isErrorMessageDisplayed() {
        return actionDriver.isDisplayed(errorMessage);
    }

    public String getErrorMessageText() {
        return actionDriver.getText(errorMessage);
    }

    public void verifyErrorMessage(String expectedText) {
        actionDriver.compareText(errorMessage, expectedText);
    }

}
