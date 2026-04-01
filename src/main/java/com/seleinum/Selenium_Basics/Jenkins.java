package com.seleinum.Selenium_Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jenkins {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://localhost:8081/");

        // Enter Username
        WebElement username = driver.findElement(By.id("j_username"));
        username.sendKeys("Prasanna-14");

        // Enter Password
        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("Prasanna098_14");

        // Click Login Button
        WebElement loginBtn = driver.findElement(By.name("Submit"));
        loginBtn.click();

        System.out.println("Page title : " + driver.getTitle());
        System.out.println("Page current URL: " + driver.getCurrentUrl());
    }
}