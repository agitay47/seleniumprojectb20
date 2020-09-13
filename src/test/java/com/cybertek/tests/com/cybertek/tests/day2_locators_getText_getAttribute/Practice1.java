package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");


        driver.findElement(By.id("searchInput")).sendKeys("Joe Biden"+ Keys.ENTER);

        String expectedTitle = "Joe Biden - Wikipedia";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Your testing is PASSED!");
        }else{
            System.out.println("Your testing is FAILED!");
        }
    }
}
