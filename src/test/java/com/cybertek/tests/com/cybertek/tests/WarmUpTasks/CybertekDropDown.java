package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;
//TC#7: Cybertek “month” dropdown default value
//1. Open browser
//2. Go to website: http://practice.cybertekschool.com/dropdowns
//3. Verify default value is always showing the current month
//o Expected: If currently in June, should show June selected.

import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class CybertekDropDown {

    WebDriver driver;

    @BeforeClass
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("\"http://practice.cybertekschool.com/dropdown\"");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void methodTask7() {
        Select select = new Select(driver.findElement(By.cssSelector("select#month")));
        String actualMonth = select.getFirstSelectedOption().getText();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("MMMM");
        String currentMonth = currentDate.format(dateformat);

        Assert.assertEquals(actualMonth, currentMonth, "Selected month does not match the current month.");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}