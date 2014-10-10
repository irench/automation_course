package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestHelper {

    public static WebDriver init(){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        return w;

    }

    public static WebDriver initGet (String ur){
        WebDriver v = init();
        v.get(ur);
        return v;
    }

    public static WebElement find(WebDriver w, String path) {
        return w.findElement(By.xpath(path));
    }
}


