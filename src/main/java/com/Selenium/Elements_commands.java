package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Elements_commands {

    static WebDriver driver;

    public static void main(String[] args) {

driver=new ChromeDriver();

WebElement address = driver.findElement(By.id("address"));

//driver.findElement(By.id("address")).click();
address.click();

//driver.findElement(By.id("address")).clear();
address.clear();

//driver.findElement(By.id("address")).getAccessibleName();
address.getAccessibleName();


// selenium methods of WebElement

        driver.findElement(By.className(""));

       /* findElement

       -uniquess class name , id , xpath
       -finding single element
       -findElement not find element - exception - - noSuchElementException


        */


/* findElements {"uname","psw","login","forgotPwd","abt"}

        driver.findElements(By.className(""));

        //finding list of matching element
        //common locator - id, class
        //ele not find - -no exception
        //return list of ele
        // store in list




 */
         List<WebElement> addresses = driver.findElements(By.id("address"));


        address.click(); // submit - Button clicking -
        address.clear();// to clear populatate - data - in input box
        address.sendKeys("874747383223");//send data in input
        address.submit();// directly submiting - clicking on that element - click();
        // there should be tagname - or value of tag - submit
        //clicking an btn
        address.getText(); // return text value of element
        //usefull for verifying value / text / title / field name/ btn name of element

        String Actual_tagname = address.getText();
        if (Actual_tagname.equals("Dashboard")){
            System.out.println("Test is passed");
        }

String string = address.getTagName(); //tagname of element

        address.getSize();//will print width and height of ele
        address.getLocation();//location of el
       // address.getScreenshotAs("")//failed - or passed - test cases - -


        // return type is boolean
        address.isDisplayed();/// dispalyed or not - - btn / form / input box / logo / dd
        //true   - if present   if not present - - false

        address.isSelected();//radio btn -true , false
        address.isEnabled();/// this ele is clickable or not  / /btn , form input - fiels -t or

        boolean disable = !address.isEnabled();

        boolean isSelected=address.isSelected();

        // html - structure of web
        // javascript- action perfomance - - user / logic , validation interaction

        //css - look , style , colour ,

        //
        JavascriptExecutor js = (JavascriptExecutor) driver;









    }


}
