package com.seleinum.Selenium_Basics;

import java.io.File;
import java.nio.file.FileSystemNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AppTest {

    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.flipkart.com/");
        System.out.println("The Page title: " + driver.getTitle());
                
        System.out.println("The page URL: " + driver.getCurrentUrl());
        
       
        
        

        



        
    }
}