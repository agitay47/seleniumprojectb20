package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3_Facebook4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

       String actualREF= driver.findElement(By.className("_8esh")).getAttribute("href");
       String expectedInHREF= "registration_form";

       if(actualREF.equals(expectedInHREF)){
           System.out.println("Test is PASSED!");
       }else{
           System.out.println("Test is FAILED!");
       }

       driver.close();


    }
}
