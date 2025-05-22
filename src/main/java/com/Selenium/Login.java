package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    static WebDriver driver;
    static  String browser ="testdfhfj";// edge // firefox

    public static void Launch_Browser(){

        //cross browser testing / paraller test / browser handling
        
    if(browser.equalsIgnoreCase("chrome")){
         driver = new ChromeDriver();
    }
    else if(browser.equalsIgnoreCase("edge")){
         driver = new EdgeDriver();
    }
    else if (browser.equalsIgnoreCase("firefox")){
         driver = new FirefoxDriver();
    }
    else{
         driver = new EdgeDriver();
    }
}


public static void  login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    driver.manage().window().minimize();
    Thread.sleep(3000);


String expected_Title = "Swag Lab";

String actual_Title = driver.getTitle();

    Match_Text(expected_Title,actual_Title);

    System.out.println("Page title is = "+driver.getTitle());

    String Expected_url = "https://www.saucedemo.com/";

    String Actual_URL = driver.getCurrentUrl();

    Match_Text(Expected_url,Actual_URL);

    System.out.println(Actual_URL);

//    for(int i=1; i<=5;i++){
//
//        Login("Text","Password");
//        //driver.close();
//    }


    }




    public static void multiple_Login(int start,int end) throws InterruptedException {

        for(int i =start; i<=end;i++ ){
            Login("standard_user","secret_sauce");
        }

    }


    public static void Login(String uName, String Pass) throws InterruptedException {

        WebElement User_Name = driver.findElement(By.id("user-name"));

        User_Name.clear();
        User_Name.sendKeys(uName);

        WebElement Password = driver.findElement(By.name("password"));

        Password.clear();
        Password.sendKeys(Pass);


        WebElement login = driver.findElement(By.className("btn_action"));

       // login.click();

        Thread.sleep(200);


    }
    public void logout(){
        driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();

    }



    public static void Match_Text(String text,String text2){
        if(text.equalsIgnoreCase(text2)){
            System.out.println(text +" is matched with "+text2+ " test is passed");
        }
        else{
            System.out.println("test is failed");
        }
    }

    public static void credentials() throws InterruptedException {

        String[] userName = {"user1","user2","user3"} ;

        String[] password = {"password1","password2","password3"} ;


        for (int i=0;i<password.length;i++){

            Login(userName[i],password[i]);

        }
    }
    public static void main(String[] args) throws InterruptedException {
        Launch_Browser();
        login();
       // multiple_Login(1,10);

        credentials();
    }

}
