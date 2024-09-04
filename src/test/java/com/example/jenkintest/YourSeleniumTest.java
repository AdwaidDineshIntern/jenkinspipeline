package com.example.jenkintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YourSeleniumTest {
    @Test
    public void testGoogleSearch() {
        // Set up the WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
