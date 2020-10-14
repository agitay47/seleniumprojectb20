package com.cybertek.tests.com.cybertek.tests.PracticeDropDown;

import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleDropdown {
    //TC #4: Selecting value from multiple select dropdown
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select all the options from multiple select dropdown.
    //4. Print out all selected values.
    //5. Deselect all values.

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test(priority = 0)
    public void multipleSelect_verification() throws InterruptedException {
        //3. Select all the options from multiple select dropdown.
        Select selectAllOption = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        Thread.sleep(3000);
        for (int i = 0; i <6 ; i++) {
            selectAllOption.selectByIndex(i);
        }
        List<WebElement> selectedOptions = selectAllOption.getAllSelectedOptions();

        //4. Print out all selected values.
        for (WebElement each:selectedOptions) {
            System.out.println(each.getText());
        }

        //5. Deselect all values.
        Thread.sleep(2000);
        selectAllOption.deselectAll();
    }
    @AfterClass
    public void closeChrome() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
