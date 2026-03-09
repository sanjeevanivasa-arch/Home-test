package com.automation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtils {

    WebDriver driver;

    public ScrollUtils(WebDriver driver){
        this.driver = driver;
    }

    // Scroll slightly down (used for lazy loading)
    public void scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,600);");
    }

    // Scroll to bottom of the page
    public void scrollToBottom(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // Scroll directly to a specific element
    public static void scrollToElement(WebDriver driver, WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].scrollIntoView({block:'center', inline:'nearest'});",
            element
        );
    }

}