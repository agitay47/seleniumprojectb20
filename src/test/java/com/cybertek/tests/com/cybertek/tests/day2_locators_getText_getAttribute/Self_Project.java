package com.cybertek.tests.com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self_Project {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //Open Chrome Browser

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();

       /* driver.findElement(By.name("search_query")).sendKeys("sakiro" + Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.linkText("Dengbej - Sakiro Keke Xiyasedin")).click();
        Thread.sleep(10000);

        driver.navigate().back(); */

        driver.findElement(By.name("search_query")).sendKeys("Omar Souleyman - Warni Warni (Official Video)" + Keys.ENTER);
        Thread.sleep(2000);

        driver.findElement(By.linkText("Omar Souleyman - Warni Warni (Official Video)")).click();
        WebElement skipButton = driver.findElement(By.linkText("skip add"));

        if(skipButton.isDisplayed())
        {
            skipButton.click();
        }

    }
}
