package com.automation.Base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> mobileEmulation =new HashMap<>();
        mobileEmulation.put("deviceName", "Pixel 2");

        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriverManager.chromedriver().setup();   
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(400, 900));
    }
    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}