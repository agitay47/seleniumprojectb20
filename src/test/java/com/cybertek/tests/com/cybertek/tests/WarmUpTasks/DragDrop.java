package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import com.cybertek.tests.com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop {

    @Test
    public void tc17_hover_test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtils.wait(2);



        WebElement from=Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement to= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        WebElement acceptCookiesButton= Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptCookiesButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(from).moveToElement(to).release().build().perform();
        String actual = to.getText();
        String expected = "You did great!";

        Assert.assertEquals(actual, expected);
        
    }

}
