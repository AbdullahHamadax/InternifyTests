package com.internify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VerifyPage extends BasePage{
    private final By mainHeader = By.tagName("h1");


    public WebElement getMainHeader(){
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mainHeader));
    }

    public boolean isMainHeaderDisplayed(){
        return getMainHeader().isDisplayed();
    }
}
