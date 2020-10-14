package com.cybertek.tests.com.cybertek.pages;

import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "ctl00$MainContent$username")
    public WebElement userNameInput;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement userpasswordInput;
}