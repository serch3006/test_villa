package com.example.demo_villa.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement searchBar;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    WebElement searchButton;

    @FindBy(how = How.NAME, using = "btnI")
    WebElement luckyButton;

    public void writeSearchBar(String search){
        searchBar.sendKeys(search);
    }

    public void clicSearchBtn(){
        searchButton.click();
    }

    public void clicLuckyBtn(){
        luckyButton.click();
    }

}
