package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestHelper {
    public static WebDriver init(){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        ChromeOptions l = new ChromeOptions();
        l.addArguments("--lang=en-us");
        WebDriver w = new ChromeDriver(l);
        return w;
}
public  static  WebDriver initget (String h){
    WebDriver l= init();
    l.get(h);
    return l;
}
    public  static void  Click (WebDriver w, String xpth){

        WebElement l = find(w, xpth);
      l.click();

   }
   public static WebElement find (WebDriver w,String path ){
       return w.findElement(By.xpath(path));


   }
   }

//public static void print (String [] whatToPrint){
// System.out.println(whatToPrint);