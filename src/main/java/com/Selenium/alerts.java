package com.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {


static WebDriver driver ;


public static void Alerts1() throws InterruptedException {
    driver=new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    Thread.sleep(2000);
    driver.findElement(By.id("confirmButton")).click();
    Alert alert1 = driver.switchTo().alert();
    String alert_content=alert1.getText();//   get alert text
    System.out.println(": alert content ==="+alert_content);
Thread.sleep(2000);
    alert1.accept();

    driver.findElement(By.id("confirmButton")).click();// click ok

    Thread.sleep(2000);
    alert1.dismiss();
//accept alert
    //  alert1.dismiss();
}

    public static void main(String[] args) throws InterruptedException {
       // Alerts1();
        Alerts2();
    }

    public static void naviagateto_el(WebElement el){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",el);
    }

    public static void Alerts2() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("promtButton"));
        naviagateto_el(element);
        element.click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();

        String alert_content=alert1.getText();//   get alert text
        System.out.println(alert_content+": alert content");
        Thread.sleep(2000);
        alert1.accept();
        Thread.sleep(2000);

alert1.dismiss();
alert1.accept();
alert1.getText();
alert1.sendKeys("Automation");



         element = driver.findElement(By.id("promtButton"));
        naviagateto_el(element);
        element.click();
         alert1 = driver.switchTo().alert();
        alert1.sendKeys("Selenium Automation is good over manual tests");
        Thread.sleep(2000);
        alert1.accept();
        element = driver.findElement(By.id("promtButton"));
        naviagateto_el(element);
        element.click();
        alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.sendKeys("Selenium Automation is good over manual tests");
        Thread.sleep(2000);
        alert1.dismiss();

//driver.quit();
        // click ok
//accept alert
        //  alert1.dismiss();
    }


}
