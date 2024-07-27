package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestOne {
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testOne() throws InterruptedException {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
        System.out.println("Title of the Webpage is "+driver.getTitle());

        Thread.sleep(4000);

        driver.quit();
    }
}
