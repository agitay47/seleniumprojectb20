package com.cybertek.tests.com.cybertek.tests.warmupTask_POM;
/*TC#30: Vytrack negative login testàWrong Password Test1.
 Go to https://qa3.vytrack.com
 2. Enter correct username
 3. Enter incorrectpassword
 4. Verify error message text is as expectedExpected: “Invalid user name or password.”
 Note: Follow Page Object Model design pattern, and get your correct credentials from configuration.properties file*/

import com.cybertek.tests.com.cybertek.pomPages.LoginVyTruck;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTruckWrongPassword {

    @Test(description = "Correct Username but incorrect password")
    public void VyTruck() {

        Driver.getDriver().get("https://qa3.vytrack.com");

        LoginVyTruck login = new LoginVyTruck();

        //correct username
        login.usernameInput.sendKeys("User160");

        //incorrect password
        login.passwordInput.sendKeys("asdff");

        //click login
        login.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(login.errorMessage.isDisplayed(), "Invalid user name or password.");

      //  Driver.getDriver().quit();


    }

    /* TC#31: Vytrack negative login testàWrong Username Test
    1. Go to https://qa3.vytrack.com
    2. Enter incorrectusername
    3. Enter correctpassword
    4. Verify error message text is as expectedExpected: “Invalid user name or password.”

   Note: Follow Page Object Model design pattern, and get your correct credentials from configuration.properties file*/

    @Test(description = "Incorrect Username but correct password")
    public void TC31_VyTruck() {

        Driver.getDriver().get("https://qa3.vytrack.com");

        LoginVyTruck login = new LoginVyTruck();

        //incorrect username
        login.usernameInput.sendKeys("User160");

        //correct password
        login.passwordInput.sendKeys("UserUserUser");

        //click login
        login.loginButton.click();

        //assert true that error message is displayed on the page
        Assert.assertTrue(login.errorMessage.isDisplayed(), "Invalid user name or password.");

        Driver.getDriver().quit();


    }
}
