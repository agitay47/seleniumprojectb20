package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;
//Practice #5: Method: printNamesAndCities
//• Create a method named printNamesAndCities in SmartBearUtils class.
//• Method takes WebDriver object.
//• This method should simply print all the names in the List of All Orders.
//• Create a new TestNG test to test if the method is working as expected.
//• Output should be like:
//• Name1: name , City1: city
//• Name2: name , City2: city

import com.cybertek.tests.com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintNamesAndCities {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }


    @Test
    public void VerifyNamesAndCities() {

        List<WebElement> names = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));
        List<WebElement> cities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[7]"));

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i).getText() + ", Cities: " + cities.get(i).getText());
        }

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
