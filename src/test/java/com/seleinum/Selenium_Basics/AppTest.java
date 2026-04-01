package com.seleinum.Selenium_Basics;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AppTest {

    @Test
    public void runFlipkartTest() {

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");   // IMPORTANT

        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.flipkart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}