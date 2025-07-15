package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class single_tab {
    static WebDriver driver;
   @Test
    public void window() throws InterruptedException {
       driver = new ChromeDriver();
       driver.get("https://demoqa.com/browser-windows");// open 1st tab
       Thread.sleep(2000);
       String parent_handle=driver.getWindowHandle();
       System.out.println("Parent Handle : "+parent_handle);
       System.out.println("Parent tab url = "+driver.getCurrentUrl());
       System.out.println("Parent Tab title = "+ driver.getTitle());

       WebElement Tabs=driver.findElement(By.id("tabButton"));
       Tabs.click();//2nd tab
       Thread.sleep(2000);

       Set<String> tab_Handles=driver.getWindowHandles();
       // will store all open tabs - window handle
       int tab_num=1;
       for (String tab_handle:tab_Handles){

           System.out.println(tab_num+" :: Tab Handle : "+tab_handle);

           tab_num++;

           if (!tab_handle.equals(parent_handle)){
               driver.switchTo().window(tab_handle);
               Thread.sleep(2000);
               System.out.println("Child Tab url = "+driver.getCurrentUrl());
               System.out.println("Child Tab title = "+ driver.getTitle());
               String text =driver.findElement(By.id("sampleHeading")).getText();
               System.out.println(text);
               driver.close();//child window closed
           }
           // shift to parent
           driver.switchTo().window(parent_handle);
           String parent_title= driver.getTitle();
           System.out.println(parent_title);



           }


    }



}
