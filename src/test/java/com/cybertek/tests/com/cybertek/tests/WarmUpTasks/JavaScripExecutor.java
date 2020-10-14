package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScripExecutor {

    @Test
    public void scrollDown(){
        Driver.getDriver().get("http://SELENIUMhq.org/download");

        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();//downcasting

        for(int i=1; i<10; i++){
            js.executeScript("window.scrollBy(0, 400)");
            BrowserUtils.wait(3);

        }
    }

    @Test
    public void scrollUp(){
        Driver.getDriver().get("http://SELENIUMhq.org/download");

        JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();//downcasting

        for(int i=1; i<10; i++){
            js.executeScript("window.scrollBy(0, -400)");
            BrowserUtils.wait(3);

        }
    }
}
