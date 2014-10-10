package com.company;

import com.company.TestHelper;
import junit.framework.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PObject {
    public static String TypeCar = "//select[@id ='ts_type']";
    public static String DetailDV = "//select[@id ='ts_details_type']";
    public static String Registration = "//select[@id ='ts_zone']";
    public static String NoCrash = "//select[@id ='no_crash_years_qty']";
    public static String Period = "//select[@id ='period']";
    public static String DGO = "//select[@id ='dgo']";
    public static String Price571 = "//tr[1]//span[@class='price']";
    public static String Price694 = "//tr[2]//span[@class='price']";
    public static String Price808 = "//tr[3]//span[@class='price']";
    public static String UrlSite = "http://strahovator.com.ua/";
    public static String OSAGO = "//a [text()='ОСАГО']";

    public static void CheckFielders(WebDriver w, String TypeCar2, String DetailDV2, String Registration2, String NoCrash2, String Period2,
                                     String DGO2) {
        Select f1 = new Select(TestHelper.find(w, TypeCar));
        f1.selectByVisibleText(TypeCar2);

        Select f2 = new Select(TestHelper.find(w, DetailDV));
        f2.selectByVisibleText(DetailDV2);

        Select f3 = new Select(TestHelper.find(w, Registration));
        f3.selectByVisibleText(Registration2);

        Select f4 = new Select(TestHelper.find(w, NoCrash));
        f4.selectByVisibleText(NoCrash2);

        Select f5 = new Select(TestHelper.find(w, Period));
        f5.selectByVisibleText(Period2);

        Select f6 = new Select(TestHelper.find(w, DGO));
        f6.selectByVisibleText(DGO2);

    }

    public static WebDriver UrlSite() {
        WebDriver url = TestHelper.initGet(UrlSite);
        return url;
    }

    public static void Click_OSAG(WebDriver w) {
        WebElement a = TestHelper.find(w, OSAGO);
        a.click();

    }

    public static  String Price (WebDriver w, String xpath){
        WebElement l = TestHelper.find(w, xpath);
        return  l.getText();

    }
}
