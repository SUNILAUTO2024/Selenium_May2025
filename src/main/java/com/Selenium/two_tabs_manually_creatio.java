package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class two_tabs_manually_creatio {
    static WebDriver driver;

    @Test
    public void multiple_Tab() throws InterruptedException {
driver=new ChromeDriver();
        driver.get("https://demoqa.com/sample");//fisrt tab - parent

        Thread.sleep(2000);
        String Parent_handle=driver.getWindowHandle();
        System.out.println(Parent_handle);
        System.out.println("First tab URL"+driver.getCurrentUrl());
        ((JavascriptExecutor)driver).executeScript(("window.open()"));
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://www.flipkart.com/");
        System.out.println("2nd tab url"+driver.getCurrentUrl());
        Thread.sleep(2000);



    }


}
