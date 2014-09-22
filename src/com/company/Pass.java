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
        w.get("http://oxogamestudio.com/passwd.current6.htm");
        WebElement m = w.findElement(By.xpath("//input [@type = 'password']"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.xpath("//td [text()='Site name']/..//input"));
        String s1 = s.getText();
       WebElement o = w.findElement(By.xpath("//td [text()='Generated password']/..//input"));
        WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));
        WebElement a = w.findElement(By.xpath("//td [text()='Site name']"));
        WebElement b = w.findElement(By.xpath("//td [text()='Your master password']"));
        WebElement c =w.findElement(By.xpath("//td [text()='Generated password']"));

        m.sendKeys("123");
        s.sendKeys("facebook.com");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");
        String a1 = a.getText();
        String b1=b.getText();
        String c1= c.getText();

        Assert.assertEquals("Hq377QTRpTWZJ@1a",o2);
        //Assert.assertTrue(s.isEnabled());
        //Assert.assertTrue(o.isEnabled());
        Assert.assertEquals("Site name",a1);
        Assert.assertEquals("Your master password",b1);
        Assert.assertEquals("Generated password",c1);
        w.quit();

    }
@Test
    public void Clear (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
    WebElement m = w.findElement(By.xpath("//input [@name ='master'][@type = 'password']"));
    String m1 = m.getText();
    WebElement s = w.findElement(By.xpath("//input [@name ='site'][@autocorrect = 'off']"));
    String s1 = s.getText();
    WebElement o = w.findElement(By.xpath("//input [@name ='password']"));
    WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));
    v.click();
        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");
        Assert.assertEquals("BaefBs8/Z/cm2@1a",o2);
    Assert.assertTrue(s.isEnabled());
    Assert.assertTrue(o.isEnabled());

    }
    @Test
    public void OneFirst(){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.xpath("//input [@name ='master'][@type = 'password']"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.xpath("//input [@name ='site'][@autocorrect = 'off']"));
        String s1 = s.getText();
        WebElement o = w.findElement(By.xpath("//input [@name ='password']"));
        WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));

        m.sendKeys("irena");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("xDsh5Y4yfwwnD@1a",o2);

        Assert.assertTrue(m.isEnabled());
        Assert.assertTrue(s.isEnabled());
        Assert.assertTrue(o.isEnabled());
        w.quit();
    }

    @Test
    public void onesecond (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.xpath("//input [@name ='master'][@type = 'password']"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.xpath("//input [@name ='site'][@autocorrect = 'off']"));
        String s1 = s.getText();
        WebElement o = w.findElement(By.xpath("//input [@name ='password']"));
        WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));
        s.sendKeys("irena.com");
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("nT376YWRIsX/D@1a",o2);
        Assert.assertTrue(s.isEnabled());
        Assert.assertTrue(o.isEnabled());
        w.quit();
    }
    @Test
    public void doubleclick ()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.xpath("//input [@name ='master'][@type = 'password']"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.xpath("//input [@name ='site'][@autocorrect = 'off']"));
        String s1 = s.getText();
        WebElement o = w.findElement(By.xpath("//input [@name ='password']"));
        WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));
        s.sendKeys("irena.com");
        v.click();
        v.click();

        while (o.getAttribute("value").equals(""));

        String o2 = o.getAttribute("value");

        Assert.assertEquals("nT376YWRIsX/D@1a",o2);
      //  Assert.assertTrue(s.isEnabled());
     //   Assert.assertTrue(o.isEnabled());
        w.quit();
    }

    @Test
    public void cleaningatributs (){
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        WebDriver w = new ChromeDriver();
        w.get("http://oxogamestudio.com/passwd.current4.htm");
        WebElement m = w.findElement(By.xpath("//input [@name ='master'][@type = 'password']"));
        String m1 = m.getText();
        WebElement s = w.findElement(By.xpath("//input [@name ='site'][@autocorrect = 'off']"));
        String s1 = s.getText();
        WebElement o = w.findElement(By.xpath("//input [@name ='password']"));
        WebElement v = w.findElement(By.xpath("//input [@type='submit'][@value='Generate']"));
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
        Assert.assertTrue(s.isEnabled());
        Assert.assertTrue(o.isEnabled());
        w.quit();

    }

}
