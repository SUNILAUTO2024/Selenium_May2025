package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class IFrame extends multipleTab
{

    // iframe - - - mini browser window inside our webpage.....

  //  webpage - - -has default html code - - driver focous on main webpage not on frames / mini window

    //mini browser window - - iframe - has its own html dom
    @Test
    public void switch_To_Frame() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().minimize();// open 1st tab
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//h1[@class='text-center']"));
        System.out.println(element.getText());
//try {
//    WebElement text=driver.findElement(By.id("sampleHeading"));//inside the frame
//    System.out.println(text);  ElementNotFoundException
//}
//catch (Exception e){
//    e.printStackTrace();
//}


        driver.switchTo().frame("frame1");//switch to frame 1

        WebElement text=driver.findElement(By.id("sampleHeading"));
        System.out.println(text.isDisplayed()+" text of iframe1 dispaleyed");
        System.out.println(text.getText());

        Thread.sleep(2000);

//        driver.switchTo().frame("goog_topics_frame");//switch to frame 2
//
//        WebElement text2=driver.findElement(By.id("sampleHeading"));
//        System.out.println(text2.isDisplayed()+" text of iframe2 dispaleyed");
//        System.out.println(text2.getText());

        driver.switchTo().defaultContent();
         element = driver.findElement(By.xpath("//h1[@class='text-center']"));
        System.out.println(element.getText());


       List<WebElement> frames=  driver.findElements(By.tagName("iframe"));
        System.out.println("How many tagnames there with iframe");
        System.out.println(frames.size());


    }



}
