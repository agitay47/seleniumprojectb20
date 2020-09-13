package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Google Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.google.com 3. Verify title:
        //Expected: Google

        WebDriverManager.chromedriver().setup();
        //if you are using browser drivers locally,you need to use System.setProperty every time

        WebDriver driver = new ChromeDriver();//open a chrome browser

        driver.get("https://www.google.com"); //go to https ://www.google.com

        String expectedTitle = "Google";
        String actualTitle   =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
        Thread.sleep(3000);

        driver.close();
    }
}
