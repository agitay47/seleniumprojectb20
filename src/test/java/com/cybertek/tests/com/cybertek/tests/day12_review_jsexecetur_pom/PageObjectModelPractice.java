package com.cybertek.tests.com.cybertek.tests.day12_review_jsexecetur_pom;

import com.cybertek.tests.com.cybertek.pomPages.LoginPage;
import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractice {
    LoginPage loginPage;

    @Test
    public void login_to_smartbear() {
        LoginPage logInPage = new LoginPage();

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        BrowserUtils.wait(5);

        loginPage.usernameInput.sendKeys("Tester");
        BrowserUtils.wait(1);

        loginPage.passwordInput.sendKeys("test");
        BrowserUtils.wait(1);

        loginPage.loginButton.click();
    }
}
