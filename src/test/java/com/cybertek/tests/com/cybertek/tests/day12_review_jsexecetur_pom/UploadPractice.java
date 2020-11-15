package com.cybertek.tests.com.cybertek.tests.day12_review_jsexecetur_pom;

import com.cybertek.tests.com.cybertek.utilities.BrowserUtils;
import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploading_file_test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();

        String path = "Users/cybertekchicago-1/Desktop/warface.jpg";

        //Locate the upload web element
        WebElement uploadInput = Driver.getDriver().findElement(By.id("file-upload"));

        //send the path of the file to uploadInput webElement
        BrowserUtils.wait(3);
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        //click to upload button
        BrowserUtils.wait(2);
        uploadButton.click();
    }
}
