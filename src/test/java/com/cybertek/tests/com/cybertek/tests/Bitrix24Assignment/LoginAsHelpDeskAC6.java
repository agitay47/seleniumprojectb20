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

public class LoginAsHelpDeskAC6 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        LoginBitrix24.loginAsHelpDesk(driver);

    }

    @Test
    public void clickAddMention() {

        WebElement emptyBody = driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']"));
        emptyBody.click();
        BrowserUtils.wait(2);

        WebElement addMention = driver.findElement(By.xpath("//span[@id='bx-b-mention-blogPostForm']"));
        addMention.click();
        BrowserUtils.wait(2);

        WebElement contacts = driver.findElement(By.xpath("//a[@href='#switchTab'][2]"));
        contacts.click();
        BrowserUtils.wait(2);

        WebElement receiver = driver.findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name'][1]"));
        receiver.click();
        BrowserUtils.wait(2);

        WebElement send = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        BrowserUtils.wait(2);


    }


    @AfterMethod
    public void tearDownMethod() {
        BrowserUtils.wait(2);
        driver.close();
    }

}
