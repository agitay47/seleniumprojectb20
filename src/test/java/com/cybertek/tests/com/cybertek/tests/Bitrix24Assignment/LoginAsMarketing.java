package com.cybertek.tests.com.cybertek.tests.Bitrix24Assignment;

import com.cybertek.tests.com.cybertek.tests.base.TestBase;
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

public class LoginAsMarketing extends TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        LoginBitrix24.loginAsMarketing(driver);
    }

    @Test
    public void clickOnLinkIcon() {

        WebElement emptyBody = driver.findElement(By.xpath("//div[@id='microoPostFormLHE_blogPostForm_inner']"));
        emptyBody.click();
        BrowserUtils.wait(2);

        WebElement clickOnLink = driver.findElement(By.xpath("//span[@title='Link']"));
        clickOnLink.click();
        BrowserUtils.wait(2);

        WebElement addText = driver.findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-text']"));
        addText.sendKeys("Cybertek");
        BrowserUtils.wait(2);

        WebElement addLink = driver.findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-href']"));
        addLink.sendKeys("https://www.cybertekschool.com/");
        BrowserUtils.wait(2);

        WebElement clickSave = driver.findElement(By.xpath("//input[@value='Save']"));
        clickSave.click();


    }

    @AfterMethod
    public void tearDown() {
        BrowserUtils.wait(2);
        driver.close();
    }
}