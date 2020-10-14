package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {
/*
    @Test
    public void mouseMover() {

        Driver.getDriver().get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);
        WebElement content = Driver.getDriver().findElement(By.xpath("//a[@class='menulink']"));
        BrowserUtils.wait(2);

        action.moveToElement(content).build().perform();

        BrowserUtils.wait(3);

        WebElement article = Driver.getDriver().findElement(By.xpath("(//a[.='Articles'])[1]"));
        article.click();


    }*/

    @Test
    public void music() {

        Driver.getDriver().get("https://demoqa.com/menu/");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        Actions actions = new Actions(Driver.getDriver());
        WebElement mainItem2 = Driver.getDriver().findElement(By.xpath("(//a[@href='#'])[2]"));
        WebElement subSubList= Driver.getDriver().findElement(By.xpath("(//a[@href='#'])[5]"));
        WebElement subSubItem1=Driver.getDriver().findElement(By.xpath("(//a[@href='#'])[6]"));
        WebElement subSubItem2=Driver.getDriver().findElement(By.xpath("(//a[@href='#'])[7]"));


        actions.moveToElement(mainItem2).build().perform();
        BrowserUtils.wait(2000);
        actions.moveToElement(subSubList).build().perform();
        BrowserUtils.wait(2000);
        actions.moveToElement(subSubItem1).build().perform();
        BrowserUtils.wait(2000);
        actions.moveToElement(subSubItem2).build().perform();
        BrowserUtils.wait(2000);

        // Close the main window
        Driver.getDriver().close();


    }
}