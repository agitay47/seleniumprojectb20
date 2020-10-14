package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick {

    @Test
    public void tc18_context_click() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(box).perform();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
