package com.cybertek.tests.com.cybertek.tests.WarmUpTasks;

import com.cybertek.tests.com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandling {

    @Test
    public void windowsHandle(){
        Driver.getDriver().get("https://www.naukri.com/");

        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles();

        int count = allWindowsHandle.size();

        System.out.println("Numbers of browser windows opened: "+count);

        for(String each : allWindowsHandle){
            Driver.getDriver().switchTo().window(each);
            String title = Driver.getDriver().getTitle();

            System.out.println("Window handle id of page -->"+ title + "--> is: "+each);

            Driver.getDriver().quit();


        }
    }
}
