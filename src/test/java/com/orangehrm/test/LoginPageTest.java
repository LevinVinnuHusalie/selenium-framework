package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseClass;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

public class LoginPageTest extends BaseClass {
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeMethod
    public void setupPages() {
        this.loginPage = new LoginPage(getDriver());
        this.homePage = new HomePage(getDriver());
    }

    @Test
    public void verifyValidLoginTest(){
        loginPage.login("admin", "admin123");
        Assert.assertTrue(homePage.isAdminTabVisible());
        homePage.logout();
        staticWait(2);
    }
}
