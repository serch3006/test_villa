package com.example.demo_villa.pages;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com.example.demo_villa.pages.steps",
        tags = "@TestManco"
)
public class RunCakeTest {

}
