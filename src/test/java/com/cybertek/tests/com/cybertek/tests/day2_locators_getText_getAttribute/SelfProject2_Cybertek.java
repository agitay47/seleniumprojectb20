package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class SelfProject2_Cybertek {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cybertekschool.com/apply-now/");

        driver.findElement(By.name("Name_First")).sendKeys("Agit");
        Thread.sleep(1500);
        driver.findElement(By.name("Name_Last")).sendKeys("AY");
        Thread.sleep(1500);
        driver.findElement(By.className("responsiveInput")).sendKeys("AA");
        Thread.sleep(1500);
        driver.findElement(By.id("date-day")).sendKeys("28");
        Thread.sleep(1500);
       // driver.findElement(By.className("zf-form-sBox responsiveInput small-input")).sendKeys("05");
       // Thread.sleep(1500);
        driver.findElement(By.id("date-year")).sendKeys("1990");
        Thread.sleep(1500);
        driver.findElement(By.name("Email1")).sendKeys("AA@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.name("PhoneNumber_countrycode")).sendKeys("9099994747");
        Thread.sleep(1500);
       // driver.findElement(By.linkText("Select your gender")).click();

        driver.quit();


    }
}
