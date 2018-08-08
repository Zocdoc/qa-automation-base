package com.zocdoc.qa.blog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class BlogTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {
        // For MacOS setup
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver");
        // For Windows setup
//        System.setProperty(
//                "webdriver.chrome.driver",
//                "webdriver/chromedriver.exe");

        testUrl = "https://www.zocdoc.com/about/blog/";

        ChromeOptions chromeOptions= new ChromeOptions();
        // replace this with the location of Chrome on your system
        chromeOptions.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.navigate().to(testUrl);
    }

    @Test
    public void firstRequirementTest() throws IOException {


    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }

}
