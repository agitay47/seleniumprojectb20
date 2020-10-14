package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RightClick {//context click


    @Test
    public void rightClickButton() {

        Driver.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement rightClick = Driver.getDriver().findElement(By.xpath("//span[.='right click me']"));
        WebElement doubleClick = Driver.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));


        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClick).perform();
        BrowserUtils.wait(2);
        actions.contextClick(doubleClick).perform();


    }


}
