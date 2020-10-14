package com.cybertek.tests.com.cybertek.tests.PracticeDropDown;

import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NonSelectDropDown {
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Click to non-select dropdown
    //4. Select Facebook from dropdown
    //5. Verify title is “Facebook - Log In or Sign Up”

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void nonSelectDropdown(){
        //3. Click to non-select dropdown
       driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();

        //4. Select Facebook from dropdown
        driver.findElement(By.xpath("//a[.='Facebook']")).click();
        //5. Verify title is “Facebook - Log In or Sign Up”

        String actualTitle=driver.getTitle();
        String expectedTitle ="Facebook - Log In or Sign Up";

        Assert.assertEquals(actualTitle,expectedTitle,"Title are not equal!");


    }


}
