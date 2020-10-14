package com.cybertek.tests.com.cybertek.tests.day12_review_jsexecetur_pom;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {

    @Test
    public void scroll_using_jsexecutor_1() {
        //Get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); //downcasting

        //use execute script method


        for (int i = 0; i < 10; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 500)");


        }

    }

    @Test
    public void scroll_using_jsexecutor_2() {
        //get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        //locating cybertek school link
        WebElement cybertekLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //use js executor to scroll 'Cybertek School' link intoView
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //use scrollIntoView function from JavaScript to scroll to a specific web element
        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekLink);
        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }

    @Test
    public void scroll_using_jsexecutor_3() {
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Dimension size = Driver.getDriver().manage().window().getSize();
        System.out.println("size = " + size);

        for (int i = 0; i < size.getWidth(); i += 110) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(" + (i / 7) + "," + i + ")");
        }
    }
}