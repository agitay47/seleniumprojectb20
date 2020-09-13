package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_Facebook1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //1-set up the web driver

        WebDriver driver = new ChromeDriver(); //this line is opening the browser

        driver.get("https://www.facebook.com/"); //3-test if driver is working // use the driver instance to test selenium

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is PASSED!");
        }else{
            System.out.println("Test is FAILED!");
        }

        driver.close();

        System.out.println("******************************************************");

    }

}
