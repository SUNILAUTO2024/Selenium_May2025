package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class open_window {
    static WebDriver driver;

    @Test
    public static void Handle_Tab() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");// open 1st tab
        Thread.sleep(2000);
        String parent_handle = driver.getWindowHandle();
        System.out.println("Parent Handle : " + parent_handle);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://the-internet.herokuapp.com");
        List<String> all_handles=new ArrayList<>(driver.getWindowHandles());
        int h=0;
        for (String handle:all_handles){

            System.out.println(h+" : window handle :"+handle);
            h++;
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        }
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());
    }



}
