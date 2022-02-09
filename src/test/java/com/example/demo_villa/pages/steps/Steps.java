package com.example.demo_villa.pages.steps;

import com.example.demo_villa.pages.Driver;
import com.example.demo_villa.pages.GoogleMainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class Steps {
    WebDriver driver;

    @Given("Open {string} webpage")
    public void open_webpage(String webpage) {
        // Write code here that turns the phrase above into concrete actions
        driver = Driver.getDriver();
        driver.get(webpage);
    }

    @Given("type in searchbar {string}")
    public void type_in_searchbar(String text) {
        // Write code here that turns the phrase above into concrete actions
        GoogleMainPage run;
        run = PageFactory.initElements(driver, GoogleMainPage.class);
        run.writeSearchBar(text);
    }


    @Given("click first option")
    public void click_first_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("click search button")
    public void clickSearchButton() {
    }
}
