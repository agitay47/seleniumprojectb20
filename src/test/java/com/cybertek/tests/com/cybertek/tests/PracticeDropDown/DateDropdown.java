package com.cybertek.tests.com.cybertek.tests.PracticeDropDown;

import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DateDropdown {
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select “December 1st, 1921” and verify it is selected.
    //Select year using : visible text
    //Select month using : value attribute
    //Select day using : index number

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void date_verification() {
        //Select year using : visible text
        Select year = new Select(driver.findElement(By.id("year"))); //By.xpath("//select[@id='year']");
        year.selectByVisibleText("1921");

        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear = "1921";
        Assert.assertEquals(actualYear, expectedYear, "Year failed!");

        //Select month using : value attribute
        Select month = new Select(driver.findElement(By.id("month")));//By.xpath("//select[@id='month']");
        month.selectByValue("11");

        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth, "Month Failed!");

        //Select day using: index number
        Select day = new Select(driver.findElement(By.id("day")));//By.xpath("//select[@id='day']");
        day.selectByIndex(0);

        String actualDay = day.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay, "Day Failed!");


    }


}
