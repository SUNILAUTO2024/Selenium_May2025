package com.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class driver_Methods {

    /* browser methods and navigation

    1)get("https://java.com") - - open URL - - open new url - wait till loading page

    2)navigate.to("") - - navigate to URL
    open new url - wait till loading page
    navigate back,
    navigate forward
    navigate and refresh
3) close()

4)quit()


//


     */

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);

        driver.navigate().to("https://maps.google.com/");
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);
        driver.navigate().refresh();



    }




}
