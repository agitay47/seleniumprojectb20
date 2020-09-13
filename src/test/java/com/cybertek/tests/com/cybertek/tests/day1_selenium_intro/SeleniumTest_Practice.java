package com.cybertek.tests.com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest_Practice {
    public static void main(String[] args) throws InterruptedException {
        String url1 = "http://www.google.com";
        String url2 = "http://www.amazon.com";
        // 1- set up web driver
        WebDriverManager.chromedriver().setup();
        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        //3- test if driver is working
        driver.get(url1);
        System.out.println("The title of the page is: " + driver.getTitle());
        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: " + actualTitle);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        Thread.sleep(3000);
        driver.navigate().to(url2);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }
}
