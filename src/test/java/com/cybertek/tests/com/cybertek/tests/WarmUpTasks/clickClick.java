package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class clickClick {

    @Test
    public void clickable() {
        Driver.getDriver().get("https://jqueryui.com/selectable/");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        BrowserUtils.wait(2);
        WebElement item1 = Driver.getDriver().findElement(By.xpath("//li[.='Item 1']"));

        BrowserUtils.wait(2);

//        WebElement item2 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[.='Item 2']"));
//        item2.click();
//        BrowserUtils.wait(2);
//
//        WebElement item3 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[.='Item 3']]"));
//        item3.click();
//        BrowserUtils.wait(2);
//
//        WebElement item4 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[4]"));
//        item4.click();
//        BrowserUtils.wait(2);
//
//        WebElement item5 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[5]"));
//        item5.click();
//        BrowserUtils.wait(2);
//
//        WebElement item6 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[5]"));
//        item6.click();
//        BrowserUtils.wait(2);
//
//        WebElement item7 = Driver.getDriver().findElement(By.xpath("//ol[@id='selectable']//li[5]"));
//        item7.click();
//        BrowserUtils.wait(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(item1).doubleClick().build().perform();

    }
}
