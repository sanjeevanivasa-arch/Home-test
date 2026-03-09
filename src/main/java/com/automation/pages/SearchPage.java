package com.automation.pages;

import com.automation.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import com.automation.pages.SearchPageLocators;
import com.automation.utils.ScrollUtils;
import java.time.Duration;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // Search for a game
    public void searchGame(String game){

        waitUtils.waitForElementVisible(SearchPageLocators.SEARCH_INPUT)
                .sendKeys(game + Keys.ENTER);
    }

    // Select game result (StarCraft II)
    public void selectGame(){

        WebElement game =
                waitUtils.waitForElementClickable(SearchPageLocators.GAME_RESULT);

        ScrollUtils.scrollToElement(driver, game);

        jsClick(game);
    }

    // JS click helper
    private void jsClick(WebElement element){

        try{

            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].scrollIntoView({block:'center'});",
                    element
            );

            js.executeScript("arguments[0].click();", element);

        }catch(Exception e){

            element.click();
        }
    }

    // Scroll to load streams
    public void scrollTwice(){

        scrollUtils.scrollDown();
        scrollUtils.scrollDown();
    }

    // Select first streamer
    public void selectFirstStreamer(){

        // Scroll first to trigger lazy loading
        scrollTwice();

        WebElement streamer =
                waitUtils.waitForElementClickable(SearchPageLocators.FIRST_STREAMER);

        ScrollUtils.scrollToElement(driver, streamer);

        jsClick(streamer);
    }

    // Handle potential "Start Watching" popup
    public void handleStreamerPopup(){

        try{

            WebElement startWatching =
                    waitUtils.waitForElementVisible(SearchPageLocators.START_WATCHING);

            if(startWatching.isDisplayed()){
                startWatching.click();
            }

        }catch(Exception e){

            System.out.println("No streamer popup");
        }
    }

    public void waitForVideoToPlay() {

        new WebDriverWait(driver, Duration.ofSeconds(40)).until(driver -> {

            JavascriptExecutor js = (JavascriptExecutor) driver;

            Object result = js.executeScript(

                    "var video = document.querySelector('video');" +
                    "if(!video) return false;" +
                    "return (!video.paused && video.readyState > 2);"
            );

            return result != null && (Boolean) result;
        });
    }
}   
