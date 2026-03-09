package com.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.utils.ScrollUtils;
import com.automation.utils.WaitUtils;


public class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;
    protected ScrollUtils scrollUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;

         waitUtils = new WaitUtils(driver);
        scrollUtils = new ScrollUtils(driver);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }


    public void click(By locator) {
        find(locator).click();
    }

    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }
}