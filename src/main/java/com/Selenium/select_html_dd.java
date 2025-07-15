package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_html_dd {
    static WebDriver driver;


    public static void handle_select_dd() throws InterruptedException {

        driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

       WebElement dd= driver.findElement(By.className("product_sort_container"));

        Select sl = new Select(dd);

        sl.getAllSelectedOptions();/// default selected option of dd

        sl.selectByIndex(2);//price low to high
        Thread.sleep(2000);
        sl.selectByValue("za");
        Thread.sleep(2000);
        sl.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);
        sl.deselectAll();
        Thread.sleep(2000);
        sl.deselectByIndex(3);
        sl.deselectByValue("hilo");
        sl.deselectByVisibleText("Price (low to high)");

        sl.getFirstSelectedOption();

    }

    public static void main(String[] args) throws InterruptedException {
        handle_select_dd();
    }

}




