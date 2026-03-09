package com.automation.pages;

import org.openqa.selenium.By;

public class SearchPageLocators {

    // Search input field
    public static final By SEARCH_INPUT =
            By.xpath("//input[@placeholder='Search']");

    // Game result (StarCraft II)
   public static final By GAME_RESULT =
        By.xpath("//h1[contains(@class,'CoreText-sc-1txzju1-0 cWFBTs')]/following-sibling::div[1]");
    // Streamer cards
    public static final By STREAMER_CARD =
            By.xpath("//h2[normalize-space(text())='Categories']");

    // First streamer in list
    public static final By FIRST_STREAMER =
            By.xpath("(//div[@class='Layout-sc-1xcs6mc-0 dAHeLj']//a)[2]");

     public static final By START_WATCHING =
            By.xpath("//button[contains(text(),'Start Watching')]");
     public static final By VIDEO_PLAYER = 
                By.xpath("//div[contains(@data-a-target,'player-overlay')]//video");

}