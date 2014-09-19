package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.Result;
import java.util.List;

@RunWith(JUnit4.class)
public class Pass {
    @Test
    public void All (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));

        m.sendKeys("123");
        s.sendKeys("facebook.com");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("Hq377QTRpTWZJ@1a",o2);
        w.quit();

    }
@Test
    public void Clear (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));
    v.click();
        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");
        Assert.assertEquals("BaefBs8/Z/cm2@1a",o2);

    }
    @Test
    public void OneFirst(){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));

        m.sendKeys("irena");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("xDsh5Y4yfwwnD@1a",o2);

        Assert.assertTrue(m.isEnabled());
        w.quit();
    }

    @Test
    public void onesecond (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));

        s.sendKeys("irena.com");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("nT376YWRIsX/D@1a",o2);
        w.quit();
    }
    @Test
    public void doubleclick ()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));

        s.sendKeys("irena.com");
        v.click();
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("nT376YWRIsX/D@1a",o2);
        w.quit();
    }

    @Test
    public void cleaningatributs (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.name("master"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.name("site"));
        String s1 = s.getText();
        List<WebElement> b = w.findElements(By.tagName("input"));
        WebElement v = b.get(2);

        WebElement o = w.findElement(By.name("password"));

        m.sendKeys("123");
        s.sendKeys("facebook.com");
        v.click();
m1 = m.getAttribute("value");
        s1 = s.getAttribute("value");

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("Hq377QTRpTWZJ@1a",o2);
        Assert.assertEquals("123",m1);
        Assert.assertEquals("facebook.com", s1);
        w.quit();

    }

}
