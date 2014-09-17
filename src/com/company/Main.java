package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Tools\\chromedriver.exe");
        ChromeOptions c = new ChromeOptions();
        c.addArguments("--lang=en-us");//аргумент для обозначения языка хрома
        WebDriver w = new ChromeDriver(c);
w.get("http://google.com");
WebElement s = w.findElement(By.name("q"));
        s.sendKeys("java"); //ввод в поисковой строке слова
        WebElement p = w.findElement(By.name("btnG"));
        p.click();
        while (w.findElements(By.id("rso")).size()==0); //цикл повторяется пока не найдет хотя бы один нужный эллемент
        WebElement r = w.findElement(By.id("rso"));
        WebElement a = r.findElement(By.tagName("a"));
        String ah = a.getAttribute("href");
           System.out.print (ah);
        if (ah.equals("https://www.java.com/ru/")){
            System.out.print ("passed");
        }
        else {
            System.out.print ("failed");
        }
       a.click();
        String t = w.getTitle();
        if (t.equals("java.com: Java и вы")){
            System.out.print ("ok");
                    }
        else {
            System.out.print ("failed");
        }
        w.quit();
                }



    }



