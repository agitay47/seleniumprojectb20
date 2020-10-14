package com.cybertek.tests.com.cybertek.tests.PracticeActionClass;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {


    @Test
    public void drag_drop() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        driver.manage().window().maximize();
        BrowserUtils.wait(2);

        WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);
       actions.clickAndHold(from).moveToElement(to).release().build().perform();



    }
}
