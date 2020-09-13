package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_Facebook2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.name("email")).sendKeys("agitay@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.name("login")).click();
        //expected message to see on display "The email you've entered doesn't match any account. Sign up for an account

        String actualTitle = driver.getTitle();
        String expectedTitle="Log into Facebook | Facebook";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is PASSED!");
        }else{
            System.out.println("Test is FAILED!");
        }

        driver.close();

    }
}