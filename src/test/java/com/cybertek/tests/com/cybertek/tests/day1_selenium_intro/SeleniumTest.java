package com.cybertek.tests.com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {//throws InterruptedException added because we applied thread.sleep();
        //1-set up the web driver
        WebDriverManager.chromedriver().setup();

        //2-create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();//this line is opening the browser
        driver.manage().window().maximize();//basically this line makes your browser maximized

        //3-test if driver is working // use the driver instance to test selenium
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: "+driver.getTitle());

        String actualTitle =driver.getTitle();  //this method does not accept any parameters//return type is String
        System.out.println("Actual Title String: "+actualTitle);

        //actualUrl.soutv + enter ==> System.out.println("Actual Url is: "+actualTitle);
        String actualUrl = driver.getCurrentUrl(); //returns current URL value as a String//it doesnt accept an argument
        System.out.println("Actual Url is: "+actualTitle);

        Thread.sleep(3000);//3000 millis=3 second// when it comes to this code execution stops two seconds

        driver.navigate().back();//this method will take the page to previous page

        Thread.sleep(3000);

        driver.navigate().forward();//this method will take the page to the forward page. you jsut go back

        Thread.sleep(3000);

        driver.navigate().refresh();//this method refresh the page

        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");  //it does excatly the same thing with ".get()" method is doing
     //it goes to URL to the given URL
        //the only difference is between .get() vs .negative().to() is get method waits for page to load. But the .to() method does not wait for the page to load

        String pageSource =driver.getPageSource();

        System.out.println("pageSource = " + pageSource);//returns the page source as a string

        driver.manage().window().maximize();//basically this line makes your browser maximized

        //driver.manage().window().fullscreen();  // same as clicking to the green button from the top left corner //works on mac

        driver.close();//close the last opened window of the browser//it close only last one

        driver.quit();// //close all of browsers opened in that session


     /*   driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.get("https://www.yahoo.com");
        System.out.println(driver.getTitle());
        driver.get("https://www.cnn.com");
        System.out.println(driver.getTitle()); */











    }


}
