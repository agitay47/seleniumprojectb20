package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick {


    @Test
    public void double_click(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        BrowserUtils.wait(2);

        WebElement newWindow= Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(newWindow);
        WebElement redText=Driver.getDriver().findElement(By.id("demo"));
        BrowserUtils.wait(2);

        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(redText).doubleClick().perform();

        String expectedColor="red";
        String actualColor=redText.getAttribute("style");
        Assert.assertTrue(actualColor.contains(expectedColor));
        System.out.println("style” attribute value contains red");
    }
}
