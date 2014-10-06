package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

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
}
