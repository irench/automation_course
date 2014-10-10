package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import sun.jdbc.odbc.ee.PooledObject;

@RunWith(JUnit4.class)
public class Test1 {
    public  WebDriver w;
@Before
   public void OpenSait (){w = PObject.UrlSite();}
@After
public  void Close_Br (){w.quit(); }

    @Test
    public void InputData(){
        PObject.Click_OSAG(w);
       PObject.CheckFielders(w,"легковой автомобиль","объем двигателя до 1600 см³ включительно","Киев","3 года","1 год","нет");
        String p1 = PObject.Price571;
       String a= PObject.Price(w,p1);
        Assert.assertEquals("571 грн.",a);

        String p2 = PObject.Price694;
        String b= PObject.Price(w,p2);
        Assert.assertEquals("694 грн.", b);

        String p3 = PObject.Price808;
        String c= PObject.Price(w,p3);
        Assert.assertEquals("808 грн.",c);
    }

}
