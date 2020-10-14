package com.cybertek.tests.com.cybertek.tests.day12_review_jsexecetur_pom;

import com.cybertek.tests.com.cybertek.utilities.Driver;
import com.cybertek.tests.com.cybertek.utilities.JavaScriptUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo {

//    @Test
//    public void flashing(){
//        Driver.getDriver().get("https://www.twoplugs.com/");
//
//        //Flashing
//        WebElement joinFree = Driver.getDriver().findElement(By.xpath("(//span[.='Join now for free'])[1]"));
//
//        JavaScriptUtil.flash(joinFree,Driver.getDriver());
//    }

    @Test //drawing border & screenshot
    public void drawborder() throws IOException {
        Driver.getDriver().get("https://www.twoplugs.com/");

        WebElement joinFree = Driver.getDriver().findElement(By.xpath("(//span[.='Join now for free'])[1]"));

        JavaScriptUtil.drawBorder(joinFree,Driver.getDriver());

        File src = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\47agi\\Desktop");
        FileUtils.copyFile(src,trg);


    }


}
