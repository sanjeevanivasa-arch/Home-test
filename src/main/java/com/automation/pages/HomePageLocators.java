package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageLocators {

     public static final By CONTINUE_BROWSER =
            By.xpath("//p[normalize-space(text())='Keep using web']");


    public static final By searchIcon = By.xpath("//a[@href=\"/directory\"]");
}

