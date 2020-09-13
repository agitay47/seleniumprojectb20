package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_ZeroBank4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //Open Chrome Browser

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");
        Thread.sleep(4000);
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
        Thread.sleep(4000);

        String expectedTitle ="Zero –Account Activity";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle))
            System.out.println("Test is PASSED!");
        else
            System.out.println("Test is FAILED!");
        System.out.println("*****************************************************");

        Thread.sleep(4000);

        driver.findElement(By.linkText("Transfer Funds")).click();

        String expectedTitle2 ="Zero - Transfer Funds";
        String actualTitle2 =driver.getTitle();

        if(actualTitle2.equals(expectedTitle2))
            System.out.println("Title Verification is PASSED!");
         else
            System.out.println("Title Verification is FAILED!");
        System.out.println("*****************************************************");


        Thread.sleep(4000);
        driver.findElement(By.linkText("Pay Bills")).click();

        String expectedTitle3 = "Zero - Pay Bills";
        String actualTitle3 = driver.getTitle();

        if(actualTitle3.equals(expectedTitle3))
            System.out.println("Title Verification is PASSED!");
         else
            System.out.println("Title Verification is FAILED!");

        System.out.println("*****************************************************");
        Thread.sleep(4000);

        driver.findElement(By.linkText("My Money Map")).click();

        String expectedTitle4 = "Zero - My Money Map";
        String actualTitle4 = driver.getTitle();

        if(actualTitle4.equals(expectedTitle4))
            System.out.println("Title Verification is PASSED!");
         else
            System.out.println("Title Verification is FAILED!");

        System.out.println("*****************************************************");
        Thread.sleep(4000);

        driver.findElement(By.linkText("Online Statements")).click();

        String expectedTitle5 = "Zero - Online Statements";
        String actualTitle5 = driver.getTitle();

        if(actualTitle5.equals(expectedTitle5))
            System.out.println("Title Verification is PASSED!");
         else
            System.out.println("Title Verification is FAILED!");
        System.out.println("*****************************************************");
        Thread.sleep(4000);
        driver.close();




    }
}
