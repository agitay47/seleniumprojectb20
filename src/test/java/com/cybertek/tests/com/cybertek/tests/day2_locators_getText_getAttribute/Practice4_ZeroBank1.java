package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4_ZeroBank1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(2000);

        String actualTitle=driver.getTitle();
        String expectedTitle="Zero - Log in";

        if(actualTitle.equals(expectedTitle))
            System.out.println("Test is PASSED!");
        else
            System.out.println("Test is FAILED!");

        driver.close();



    }
}
