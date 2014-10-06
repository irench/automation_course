package com.company;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FbPOject {
    public static String UrlSite = "https://www.facebook.com/";
    public static String FirstNamePath = "//input [@name ='firstname']";
    public static String LastName = "//input [@name ='lastname']";
    public static String Email = "//input [@name='reg_email__']";
    public static String ReEmail = "//input[@name='reg_email_confirmation__']";
    public static String Password ="//input[@name='reg_passwd__']";
    public static String SexFemale = "//input[@id='u_0_d']";
    public static String SexMale = "//input[@id='u_0_e']";
    public static String SingUp = "//button [@name = 'websubmit']";
    public static String BrthdMonth = "//select[@id='month']";
    public static String BrthdDate = "//select[@id='day']";
    public static String BrthdYear = "//select[@id='year']";
    public static String ErrorBthd = "//select[@id='month']/../../../i[1]";
    public static String WhtYourName = "//div[text()='What’s your name?']";


    public static void Input_First_Name(WebDriver w, String data) {
        WebElement a = TestHelper.find(w, FirstNamePath);
        a.sendKeys(data);
    }

    public static void Input_Last_Name(WebDriver w, String data) {
        WebElement a = TestHelper.find(w, LastName);
        a.sendKeys(data);
    }

    public static void Input_Email(WebDriver w, String data) {
        WebElement a = TestHelper.find(w, Email);
        a.sendKeys(data);
    }

    public static void Input_ReEmail(WebDriver w, String data) {
        WebElement a = TestHelper.find(w, ReEmail);
        a.sendKeys(data);
    }
    public  static  void  Input_Password (WebDriver w, String data){
        WebElement a = TestHelper.find(w,Password);
    }

    public static void Sex_Female(WebDriver w) {
        WebElement a = TestHelper.find(w, SexFemale);
        a.click();
    }

    public static void Sex_Male(WebDriver w) {
        WebElement a = TestHelper.find(w, SexMale);
        a.click();
    }

    public static void Click_SingUp(WebDriver w) {
        WebElement a = TestHelper.find(w, SingUp);
        a.click();
    }

public static WebDriver UrlSite(){
    WebDriver url= TestHelper.initget(UrlSite);
    return url;

}
public static boolean Error (WebDriver w, String baseXpath){
    WebElement e = TestHelper.find(w,baseXpath+"/../../i[1]");
    return e.isDisplayed();
}
    public static void Brtday (WebDriver w, String date, String month, String year ){
        Select d = new Select(TestHelper.find(w,BrthdDate));
        d.selectByVisibleText(date);
        Select m = new Select(TestHelper.find(w,BrthdMonth));
        m.selectByVisibleText(month);
        Select y= new Select(TestHelper.find(w,BrthdYear));
        y.selectByVisibleText(year);
    }
    public static   boolean What_Name (WebDriver w){
        WebElement n = TestHelper.find(w,WhtYourName);
        return n.isDisplayed();
    }

}


