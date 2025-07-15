package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleTab {
    static WebDriver driver;
    @Test
    public void window() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        max_Window();// open 1st tab
        Thread.sleep(2000);
        String parent_handle = driver.getWindowHandle();
        System.out.println("Parent Handle : " + parent_handle);
        System.out.println("Parent tab url = " + driver.getCurrentUrl());
        System.out.println("Parent Tab title = " + driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/");
        max_Window();//2nd tab
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String flipkart_handle = driver.getWindowHandle();

     driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.amazon.in/");
        max_Window();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String amazon_handle = driver.getWindowHandle();

        driver.switchTo().window(parent_handle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
//        WebElement Tabs=driver.findElement(By.id("tabButton"));
//        Tabs.click();//2nd tab
//        Thread.sleep(2000);
//        Tabs.click();//3rd tab child
//        Thread.sleep(2000);

       // driver.close();
//git
        driver.switchTo().window(amazon_handle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
      //  driver.close();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
//        Thread.sleep(2000);
        //driver.findElement(By.id("nav-search-submit-button")).click();

        driver.switchTo().window(flipkart_handle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//span[text()='Fashion']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // driver.close();

        driver.quit();





    }

    public static void max_Window(){
        driver.manage().window().minimize();
    }


}
