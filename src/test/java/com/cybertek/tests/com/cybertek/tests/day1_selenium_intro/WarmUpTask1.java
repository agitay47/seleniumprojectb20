package com.cybertek.tests.com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); //1-set up the web driver

        WebDriver driver = new ChromeDriver();  // 2-Open the browser

        String Url = "http://google.com";   //3-Get Url
        // launch Chrome and direct it to the URL
        driver.get(Url);

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle(); // get the actual value of the title
        System.out.println("Actual Title String: "+actualTitle);


        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        Thread.sleep(3000); // wait 3 second then close the browser

        //close Chrome
        driver.close();


    }
}
