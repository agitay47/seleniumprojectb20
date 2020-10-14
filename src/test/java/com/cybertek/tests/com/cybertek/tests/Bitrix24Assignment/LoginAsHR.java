package com.cybertek.tests.com.cybertek.tests.Bitrix24Assignment;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.LoginBitrix24;
import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginAsHR {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        LoginBitrix24.loginAsHR(driver);
    }

    @Test
    public void setReminder()  {

        WebElement clickEvent = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-calendar']"));
        clickEvent.click();
        BrowserUtils.wait(2);

        WebElement createEventName = driver.findElement(By.xpath("//input[@placeholder='Event name']"));
        createEventName.click();
        createEventName.sendKeys("Gradation Party for Batch20 ");
        BrowserUtils.wait(2);

//////        WebElement chooseDate = driver.findElement(By.xpath("//input[@name='DATE_FROM']"));
//////        chooseDate.sendKeys("09/28/2020");
//////        thread();
//////
//////        WebElement chooseAndDate = driver.findElement(By.xpath("input[@name='DATE_TO']]"));
//////        chooseAndDate.sendKeys("09/28/2020");
//////        thread();
////
////        WebElement setReminder = driver.findElement(By.xpath("//input[@class='feed-event-rem-ch']"));
////        setReminder.click();
////        thread();
//
//        WebElement location = driver.findElement(By.xpath("//input[@id='event-locationcal_3Jcl']"));
//        location.click();
//        thread();

//        WebElement receiver = driver.findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name'][1]"));
//        receiver.click();
//        thread();

        WebElement send = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        send.click();


    }

    @AfterMethod
    public void tearDownMethod() {
        BrowserUtils.wait(2);
        driver.close();
    }
}
