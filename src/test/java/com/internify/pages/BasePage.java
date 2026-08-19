package com.internify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    protected static WebDriverWait wait;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement find(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    protected void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void scrollTo(By locator) {
        WebElement element = find(locator);

        new Actions(driver)
                .scrollToElement(element)
                .perform();
    }

    protected void click(By locator) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }

    protected boolean urlContains(String value) {
        return wait.until(
                ExpectedConditions.urlContains(value)
        );
    }

}
