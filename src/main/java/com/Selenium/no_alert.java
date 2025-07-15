package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class no_alert {
    static WebDriver driver ;


    public static void Alerts1() throws InterruptedException {
        try {


            driver = new ChromeDriver();
            driver.get("https://demoqa.com/alerts");
            Thread.sleep(2000);
            // driver.findElement(By.id("confirmButton")).click();// triggering alert
//NoAlertPresentException: no such alert
            Alert alert1 = driver.switchTo().alert();
            String alert_content = alert1.getText();//   get alert text
            System.out.println(": alert content ===" + alert_content);
            Thread.sleep(2000);
            alert1.accept();

            driver.findElement(By.id("confirmButton")).click();// click ok

            Thread.sleep(2000);
            alert1.dismiss();
//accept alert
            //  alert1.dismiss();
        }
        catch (Exception alertException){
            alertException.printStackTrace();
            System.out.println(alertException.getMessage());
        }
    }
    public static void test_alert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        // Alerts1();
        Alerts1();
        test_alert();
    }
}
