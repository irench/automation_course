package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassGen_first {
    public static String Password = "//input [@type = 'password']";
    public static String InputC = "//td [text()='Site name']/..//input";
    public static String ClPass = "//input [@type='submit'][@value='Generate']";
    public static String masterFind = "//td [text()='Generated password']/..//input";
    public  static String SiteName = "//td [text()='Site name']";
    public  static String GeneratePass = "//td [text()='Generated password']";
    public  static String MastPass= "//td [text()='Your master password']";
    public  static  String UrlSite = "http://oxogamestudio.com/passwd.current6.htm";

    public static void InputData_1(WebDriver w, String t) {

        WebElement b = TestHelper.find(w,Password);
        b.sendKeys(t);
    }

    public static void click(WebDriver w) {

        WebElement l = TestHelper.find(w, ClPass);
        l.click();

    }

    public  static  void InputSite_2(WebDriver w, String url){
        WebElement urq = TestHelper.find(w, InputC);
        urq.sendKeys(url);
    }

    public  static  String GetPassword (WebDriver w){
        WebElement pas = TestHelper.find(w,masterFind);

        return  pas.getAttribute("value");

            }
    public  static  String SiteN (WebDriver w){
        WebElement sn = TestHelper.find(w,SiteName);
        return  sn.getText();
    }

    public  static  String MasPas (WebDriver w){
        WebElement mp = TestHelper.find(w, MastPass);
                return mp.getText();
        }
    public  static  String GenP_3(WebDriver w){
        WebElement gp = TestHelper.find(w,GeneratePass );
        return gp.getText();
    }
    public  static WebDriver urlSite (){
        WebDriver l = TestHelper.initget(UrlSite);
        return  l;
        }
    public static boolean mast_field_enab1(WebDriver w){
        WebElement n = TestHelper.find(w,Password);
       return n.isEnabled();

    }
    public static boolean mast_field_enab2 (WebDriver w){
        WebElement m = TestHelper.find(w, InputC);
        return m.isEnabled();
    }

    public  static boolean mast_field_enab3 (WebDriver w){
        WebElement k = TestHelper.find(w, ClPass);
        return k.isEnabled();
    }

    public static String get_atrib1 (WebDriver w){
        WebElement a1 = TestHelper.find(w,Password );
        return a1.getAttribute("value");
    }


    public static String get_atrib2 (WebDriver w){
        WebElement a2 = TestHelper.find(w,InputC );
        return a2.getAttribute("value");
    }
}
