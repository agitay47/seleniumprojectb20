package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShoot {
    public static void main(String[] args) throws IOException {
        Driver.getDriver().get("http://www.facebook.com");
        takeScreenshot("Facebook_LoginPage");
    }

    public static void takeScreenshot(String fileName) throws IOException {
        //1.take screenshot and store it as a file format
       File file= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

       //2.now copy the screenshot to desired location using copyFile method
        FileUtils.copyFile(file,new File("src/test/java/com/cybertek/tests/com/cybertek/tests/day1_selenium_intro/"
                +fileName+".jpg"));
    }
}
