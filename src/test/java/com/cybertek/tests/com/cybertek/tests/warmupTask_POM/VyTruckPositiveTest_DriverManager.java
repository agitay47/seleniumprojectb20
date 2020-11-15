package com.cybertek.tests.com.cybertek.tests.warmupTask_POM;
/* TC#33 : Vytrackpositive login test àDriver Manager
1. Go to https://qa3.vytrack.com
2. Enter correct username
3. Enter correct password
4. Verify title changedExpected: “Dashboard”
Note: Follow Page Object Model design pattern, and get your credentials from configuration.properties file*/

import com.cybertek.tests.com.cybertek.pomPages.LoginVyTruck;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTruckPositiveTest_DriverManager {

    @Test(description = "Correct Username but incorrect password")
    public void VyTruck() {

        Driver.getDriver().get("https://qa3.vytrack.com");

        LoginVyTruck login = new LoginVyTruck();

        //correct username
        login.usernameInput.sendKeys("salesmanager265");

        //incorrect password
        login.passwordInput.sendKeys("UserUser123");

        //click login
        login.loginButton.click();

        //Title Expected
        String expectedTitle="Dashboard";
        String actualTitle = Driver.getDriver().getTitle();

        //assert true that error message is displayed on the page
        Assert.assertTrue(expectedTitle.equals(actualTitle));

        Driver.getDriver().quit();


    }

}


