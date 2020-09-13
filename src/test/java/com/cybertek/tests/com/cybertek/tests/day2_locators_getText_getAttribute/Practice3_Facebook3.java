package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_Facebook3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String actualHeader   = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Test is PASSED!");
        }else{
            System.out.println("Test is FAILED!");
        }
        driver.close();
    }
}
