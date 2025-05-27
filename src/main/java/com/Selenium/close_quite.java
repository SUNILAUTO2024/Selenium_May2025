package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_quite {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

//        driver.navigate().to("https://maps.google.com/");
//        Thread.sleep(2000);

       // driver.navigate().back();

        //driver.close();

        WebElement User_Name = driver.findElement(By.id("user-name"));

        User_Name.clear();
        User_Name.sendKeys("standard_user");

        WebElement Password = driver.findElement(By.name("password"));

        Password.clear();
        Password.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[@class=\"social_twitter\"]/child::a")).click();
        Thread.sleep(3000);

        driver.close();


    }
}
