package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.automation.pages.HomePageLocators;
import com.automation.utils.ScrollUtils;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends BasePage {

    
   
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        
    }

     // Handle mobile modal (Continue in Browser)
    public void handleBrowserModal(){

    try{
        WebElement continueButton = new WebDriverWait(driver, Duration.ofSeconds(15))
            .until(ExpectedConditions.elementToBeClickable(HomePageLocators.CONTINUE_BROWSER));

        continueButton.click();

    }catch(Exception e){

        System.out.println("No browser modal");
    }
}

    

   public void clickSearch() {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement searchIcon = wait.until(
            ExpectedConditions.elementToBeClickable(HomePageLocators.searchIcon)
    );

    ScrollUtils.scrollToElement(driver, searchIcon);

    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchIcon);
}
}



            
   

    

    
