package com.internify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private final By mainHeader = By.tagName("h2");


    public String getMainHeaderText() {
        return find(mainHeader).getText();
    }

    public boolean isLoginPageLoaded() {
        return urlContains("/login");
    }

}
