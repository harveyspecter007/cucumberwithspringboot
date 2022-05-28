package com.home.ui;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HomePage {


    public WebDriver webDriver;

    @Test
    public void getSearchResultsCount()
    {
        System.setProperty("webdriver.chrome.driver","/Users/kalyansangaraju/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.jobserve.com/gb/en/Job-Search/");
       WebElement webElement= webDriver.findElement(By.id("btnSearch"));
        webElement.click();
        WebElement webElement1 = webDriver.findElement(By.className("resultnumber"));
        System.out.println(webElement1.getText());
        webDriver.close();

    }
}
