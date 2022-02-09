package com.example.demo_villa.pages;

import com.example.demo_villa.pages.GoogleMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

//
//borrar instancia chromedriver despues de ejecutar*******************************************************************
public class Test {
    public static void main(String[] args){
        WebDriver driver = Driver.getDriver();
        driver.get("http://www.google.com");
        GoogleMainPage run;
        run = PageFactory.initElements(driver, GoogleMainPage.class);
        run.writeSearchBar("Manco");
        run.clicSearchBtn();
        /*Definition run = new Definition();
        run.mandaManco();*/
    }
}
