package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class Pass {



    @Test
    public void All (){
       WebDriver w = PassGen_first.urlSite();


        PassGen_first.InputData_1(w, "123");
        PassGen_first.InputSite_2(w, "facebook.com");
       PassGen_first.click(w);

        String o2 = PassGen_first.GetPassword(w);
        String a1 = PassGen_first.SiteN(w);
        String b1=PassGen_first.MasPas(w);
        String c1= PassGen_first.GenP_3(w);

        Assert.assertEquals("Hq377QTRpTWZJ@1a",o2);
        Assert.assertEquals("Site name",a1);
        Assert.assertEquals("Your master password",b1);
        Assert.assertEquals("Generated password",c1);
        w.quit();

    }
@Test
    public void Not_Diseable (){
    WebDriver w = PassGen_first.urlSite();
    PassGen_first.InputData_1(w,"123");
    PassGen_first.InputSite_2(w,"facebook.com");
    PassGen_first.click(w);

    Boolean f1 = PassGen_first.mast_field_enab1(w);
    Boolean f2 = PassGen_first.mast_field_enab2(w);
    Boolean f3 =PassGen_first.mast_field_enab3(w);
    String pas = PassGen_first.GetPassword(w);


    Assert.assertEquals(true,f1);
    Assert.assertEquals(true,f2);
    Assert.assertEquals(true,f3);
    Assert.assertEquals("Hq377QTRpTWZJ@1a",pas);

    w.quit();

    }
    @Test
    public void OneFirst(){
        WebDriver w = PassGen_first.urlSite();
        PassGen_first.InputData_1(w,"irena");
        PassGen_first.click(w);

        Boolean f1 = PassGen_first.mast_field_enab1(w);
        Boolean f2 = PassGen_first.mast_field_enab2(w);
        Boolean f3 =PassGen_first.mast_field_enab3(w);
        String pas = PassGen_first.GetPassword(w);


        Assert.assertEquals(true,f1);
        Assert.assertEquals(true,f2);
        Assert.assertEquals(true,f3);
        Assert.assertEquals("xDsh5Y4yfwwnD@1a",pas);
        w.quit();
    }

    @Test
    public void onesecond (){
        WebDriver w = PassGen_first.urlSite();
        PassGen_first.InputSite_2(w,"facebook.com");
        PassGen_first.click(w);

        Boolean f1 = PassGen_first.mast_field_enab1(w);
        Boolean f2 = PassGen_first.mast_field_enab2(w);
        Boolean f3 =PassGen_first.mast_field_enab3(w);
        String pas = PassGen_first.GetPassword(w);


        Assert.assertEquals(true,f1);
        Assert.assertEquals(true,f2);
        Assert.assertEquals(true,f3);
        Assert.assertEquals("lFAosQQIiXvAR@1a",pas);

        w.quit();
    }
    @Test
    public void doubleclick ()
    {
        WebDriver w = PassGen_first.urlSite();
        PassGen_first.InputSite_2(w,"facebook.com");
        PassGen_first.click(w);
        PassGen_first.click(w);

        Boolean f1 = PassGen_first.mast_field_enab1(w);
        Boolean f2 = PassGen_first.mast_field_enab2(w);
        Boolean f3 =PassGen_first.mast_field_enab3(w);
        String pas = PassGen_first.GetPassword(w);


        Assert.assertEquals(true,f1);
        Assert.assertEquals(true,f2);
        Assert.assertEquals(true,f3);
        Assert.assertEquals("lFAosQQIiXvAR@1a",pas);

        w.quit();
    }

    @Test
    public void cleaningatributs (){
        WebDriver w = PassGen_first.urlSite();
        PassGen_first.InputData_1(w, "123");
        PassGen_first.InputSite_2(w,"facebook.com");
        PassGen_first.click(w);


        Boolean f1 = PassGen_first.mast_field_enab1(w);
        Boolean f2 = PassGen_first.mast_field_enab2(w);
        Boolean f3 =PassGen_first.mast_field_enab3(w);
        String pas = PassGen_first.GetPassword(w);
      String ff1= PassGen_first.get_atrib1(w);
       String ff2 = PassGen_first.get_atrib2(w);


        Assert.assertEquals("123",ff1);
        Assert.assertEquals("facebook.com", ff2);
        Assert.assertEquals("Hq377QTRpTWZJ@1a",pas);
        Assert.assertEquals(true,f1);
        Assert.assertEquals(true,f2);
        Assert.assertEquals(true,f3);
        w.quit();

    }

}
