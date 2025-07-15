package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Handling_Windows_Tab {

    static WebDriver driver;

@Test
    public static void Handle_Tab() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");// open 1st tab
        Thread.sleep(2000);
        String parent_handle=driver.getWindowHandle();
        System.out.println("Parent Handle : "+parent_handle);

        WebElement Tabs=driver.findElement(By.id("tabButton"));
        Tabs.click();//2nd tab
    Thread.sleep(2000);
    Tabs.click();//3rd tab child
    Thread.sleep(2000);
    Tabs.click();//4th tab child
        //child tab - and its window handle created - parent - child
//for every window or tab - window handle id will be unique - -
        Set<String> tab_Handles=driver.getWindowHandles();
        // will store all open tabs - window handle
    int tab_num=1;
        for (String tab_handle:tab_Handles){

            System.out.println(tab_num+" :: Tab Handle : "+tab_handle);
            if (tab_num==3) {
                Thread.sleep(2000);
                driver.switchTo().window(tab_handle);
                driver.close();
                Thread.sleep(2000);
                driver.switchTo().window(parent_handle);
                System.out.println(driver.getCurrentUrl());
            }
            tab_num++;


            //driver.quit();
        }

    }


}

//close  / quite
