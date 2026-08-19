package com.internify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    private final By mainHeader =  By.tagName("h1");
    private final By howItWorksLink = By.cssSelector("a[href='/#how-it-works']");
    private final By howItWorksSection = By.id("how-it-works");

    private final By loginButton = By.cssSelector("a[href='/login']");


    private final By verifyButton = By.cssSelector("main a[href='/verify']");
    private final By aboutLink = By.cssSelector("a[href='/about']");
    private final By themeButton = By.cssSelector("button[aria-label='Toggle theme']");


    public WebElement getMainHeader(){
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mainHeader));
    }


    public boolean isMainHeaderDisplayed(){
        return getMainHeader().isDisplayed();
        }

    public AboutPage clickAbout() {
        click(aboutLink);
        return new AboutPage();
    }

    public void toggleTheme(){
        click(themeButton);
    }

    public boolean isDarkModeDisabled(){
        String html =
                driver.findElement(By.tagName("html"))
                        .getAttribute("class");

        return !html.contains("dark");
    }

    public void clickHowItWorks(){
        click(howItWorksLink);
    }

    public void clickLogin(){
        click(loginButton);
    }

    public void scrollToVerify(){
        scrollTo(verifyButton);
    }

    public VerifyPage clickVerify(){
        click(verifyButton);
        return new VerifyPage();
    }

    public boolean isHowItWorksDisplayed() {
        return find(howItWorksSection).isDisplayed();
    }

}
