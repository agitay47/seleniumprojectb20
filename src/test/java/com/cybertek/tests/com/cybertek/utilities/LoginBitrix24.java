package com.cybertek.tests.com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginBitrix24 {
    public static void loginAsHelpDesk(WebDriver driver) {
        //1. Enter username: “helpdesk10@cybertekschool.com”

        WebElement usernameInput = driver.findElement(By.xpath("//input[@class='login-inp']"));
        usernameInput.sendKeys("helpdesk10@cybertekschool.com");

        //2. Enter password: “UserUser”
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");

        //3. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    public static void loginAsMarketing(WebDriver driver) {
        //1. Enter username: “marketing10@cybertekschool.com”

        WebElement usernameInput = driver.findElement(By.xpath("//input[@class='login-inp']"));
        usernameInput.sendKeys("marketing10@cybertekschool.com");

        //2. Enter password: “UserUser”
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");

        //3. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    public static void loginAsHR(WebDriver driver) {
        //1. Enter username: “hr10@cybertekschool.com”

        WebElement usernameInput = driver.findElement(By.xpath("//input[@class='login-inp']"));
        usernameInput.sendKeys("hr10@cybertekschool.com");

        //2. Enter password: “UserUser”
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");

        //3. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }
}
