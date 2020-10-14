package com.cybertek.tests.com.cybertek.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    public static void flash(WebElement element, WebDriver driver) {

        String bgcolor = element.getCssValue("backgroundColor");//green

        for (int i = 0; i < 10; i++) {
            changeColor("#000000", element, driver);//1
            changeColor(bgcolor, element, driver);

        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.background= '" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
        }
    }

    public static void drawBorder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);

    }
}
