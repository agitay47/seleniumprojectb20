package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

//1. Open browser
//2. Go to website: http://practice.cybertekschool.com/registration_form
//3. Enter first name
//4. Enter last name
//5. Enter username
//6. Enter email address
//7. Enter password
//8. Enter phone number
//9. Select a gender from radio buttons
//10.Enter date of birth
//11.Select Department/Office
//12.Select Job Title
//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration!” is
//displayed.

import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CybertekRegistration {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");

    }

    public void thread() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void registrationForm() throws InterruptedException {

        Faker faker = new Faker();

        //firstName
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys(faker.name().firstName());
        thread();

        //lastName
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName());
        thread();

        //userName
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("agitay4747");
        thread();

        //email
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("agitay2@gmail.com");
        thread();

        //password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("111111111111111");
        thread();

        //phoneNumber
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        phoneNumber.sendKeys("909-999-9999");
        thread();

        //gender
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();
        thread();

        //dob
        WebElement dob = driver.findElement(By.name("birthday"));
        dob.sendKeys("05/28/1990");
        thread();

        //department
        Select department = new Select(driver.findElement(By.cssSelector("select[name='department']")));
        department.selectByVisibleText("Department of Engineering");
        thread();

        //jobTitle
        Select jobTitle = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        jobTitle.selectByVisibleText("QA");
        thread();

        //Select programming languages
        driver.findElement(By.xpath("//input[@value='java']")).click();
        thread();

       //SignUp
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement message=driver.findElement(By.xpath("//p"));
        String actualMessage=message.getText();
        String expectedMessage="You've successfully completed registration!";

        Assert.assertEquals(actualMessage,expectedMessage,"FAILED,Try again");


    }


    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
