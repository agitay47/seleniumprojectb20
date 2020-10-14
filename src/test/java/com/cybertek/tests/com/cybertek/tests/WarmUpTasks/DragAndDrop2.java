package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop2 {
    @Test
    public void drag_drop() {

        Driver.getDriver().get("http://practice.cybertekschool.com/drag_and_drop");

        Driver.getDriver().manage().window().maximize();
        BrowserUtils.wait(2);

        WebElement from=Driver.getDriver().findElement(By.xpath("(//div[@class='column'])[1]"));
        WebElement to=Driver.getDriver().findElement(By.xpath("(//div[@class='column'])[2]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(from).moveToElement(to).release().build().perform();





    }
}
