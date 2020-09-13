package com.cybertek.tests.com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String Url = "https://practice.cybertekschool.com";
        driver.get(Url);

        String expectedTitle = "cybertekschool";
        String actualTitle = driver.getTitle(); // get the actual value of the title
        System.out.println("Actual Title String: "+actualTitle);

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Good Job!");
        } else {
            System.out.println("Re-Test");

            Thread.sleep(3000); // wait 3 second then close the browser


            driver.close();
        }

    }
}
