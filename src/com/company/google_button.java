package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 9/17/14.
 */
public class google_button {
public static void main (String [] args){
    System.setProperty("webdriver.chrome.driver","D:\\Tools\\chromedriver.exe");
    WebDriver w = new ChromeDriver ();
    w.get("http://google.com");
    WebElement b1 = w.findElement(By.id("gbqfsa"));
    String k = b1.getText();
    if (k.equals("Поиск в Google")){
        System.out.print ("passed b1");
    }
    else {
        System.out.print ("failed");
    }
    WebElement b2 = w.findElement(By.id("gbqfsb"));
        String v = b2.getText();
    if (v.equals("Мне повезёт!"))
    {
        System.out.print ("passed b2");
    }
    else {
        System.out.print ("Failed");
    }

    WebElement b3 = w.findElement(By.id("addlang"));
    String q = b3.getText();
    if (q.equals("Google.com.ua предлагается на: українська"))
    {
        System.out.print ("passed");
    }
    else {
        System.out.print ("failed");

    }
}
}
