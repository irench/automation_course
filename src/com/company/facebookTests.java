package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(JUnit4.class)
public class facebookTests {
    public WebDriver w;
    @Before
    public void BeforeOpenSite (){
        w = FbPOject.UrlSite();
    }

    @After
    public  void Close_Br (){w.quit(); }

    @Test
    public void Not_Data (){
        FbPOject.Click_SingUp(w);
        Boolean fn = FbPOject.What_Name(w);
        Boolean ln = FbPOject.Error(w,FbPOject.LastName);
        Boolean email = FbPOject.Error(w, FbPOject.Email);
        Boolean re_email = FbPOject.Error(w,FbPOject.ReEmail);
        Boolean password = FbPOject.Error(w,FbPOject.Password);

        Assert.assertTrue(fn);
        Assert.assertTrue(ln);
        Assert.assertTrue(email);
        Assert.assertTrue(re_email);
        Assert.assertTrue(password);
    }
      @Test
    public void InvalidEmail (){
       FbPOject.Input_Email(w,"irench@gml.com.");
       FbPOject.ClickText(w);

        Boolean email = FbPOject.Error(w, FbPOject.Email);

        Assert.assertTrue(email);
    }
    @Test
    public void InvalidReEmail (){
        FbPOject.Input_Email(w,"irench@gmail.com");
        FbPOject.Input_ReEmail(w,"irench88@gmail.com");
        FbPOject.ClickText(w);
        FbPOject.ClickErrorReEmail(w,FbPOject.ReEmail);
        Boolean messageReEmail =  FbPOject.TextErrorReEm(w) ;
        Assert.assertTrue(messageReEmail);
    }
    @Test
    public void TextMessengers (){
        FbPOject.Click_SingUp(w);
        FbPOject.ClickErrorReEmail(w,FbPOject.ReEmail);
        boolean mesReem = FbPOject.TextMessengers(w,"Your emails do not match. Please try again.");
        Assert.assertTrue(mesReem);
        boolean mesEmail = FbPOject.TextMessengers(w,"")



    }
}
