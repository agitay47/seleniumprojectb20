package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GmailActions {

    @Test
    public void loginGmail(){
        Driver.getDriver().get("https://www.actimind.com/");

        WebElement AreaOfExpertise = Driver.getDriver().findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
        WebElement cloudApplications = Driver.getDriver().findElement(By.xpath("(//a[.='Cloud Applications'])[1]"));
        BrowserUtils.wait(2);

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(AreaOfExpertise).build().perform();
        BrowserUtils.wait(3);
        actions.moveToElement(cloudApplications).click().perform();


    }
}
