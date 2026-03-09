package com.automation.tests;

import com.automation.Base.BaseTest;
import com.automation.pages.HomePage;
import com.automation.pages.SearchPage;
import com.automation.utils.ScreenshotUtils;

import org.testng.annotations.Test;

public class TwitchTest extends BaseTest {

    @Test
    public void testTwitchSearch() throws InterruptedException {

        driver.get("https://m.twitch.tv");
        HomePage home = new HomePage(driver);
        home.clickSearch();

        SearchPage search = new SearchPage(driver);
        Thread.sleep(3000);
        search.searchGame("StarCraft II");
        search.selectGame();
        Thread.sleep(2000);
        search.scrollTwice();
        Thread.sleep(3000);
        search.selectFirstStreamer();
        search.handleStreamerPopup();
        search.waitForVideoToPlay();

        System.out.println("Video started successfully");

        Thread.sleep(10000);

        ScreenshotUtils.takeScreenshot(driver, "streamer_page");
    }
}