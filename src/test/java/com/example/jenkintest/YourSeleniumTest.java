package com.example.jenkintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YourSeleniumTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup Firefox driver
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
 // Update with the path to your geckodriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testExample() {
        driver.get("https://example.com");
        // Add your test code here
    }

    @AfterClass
    public void tearDown() {
        // Cleanup
        if (driver != null) {
            driver.quit();
        }
    }
}
