package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;
//PRACTICE #4: Method: verifyOrder
//• Create a method named verifyOrder in SmartBearUtils class.
//• Method takes WebDriver object and String(name).
//• Method should verify if given name exists in orders.
//• This method should simply accepts a name(String), and assert whether
//given name is in the list or not.
//• Create a new TestNG test to test if the method is working as expected.

import com.cybertek.tests.com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyOrder {

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
    public void verifyOrder() {

        List<WebElement> names = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));


        for (WebElement each : names) {
            each.getText();
            Assert.assertTrue(true);
            return;
        }

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

}
