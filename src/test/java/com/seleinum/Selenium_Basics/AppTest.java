package com.seleinum.Selenium_Basics;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

    @Test
    public void runFlipkartTest() {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flipkart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}