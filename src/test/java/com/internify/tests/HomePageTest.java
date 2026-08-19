package com.internify.tests;

import com.internify.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {
    @Test
    public void testHomePageOpens() {
        Assert.assertTrue(homePage.isMainHeaderDisplayed());
    }

    @Test
    public void testHowItWorksNavigation() {
        homePage.clickHowItWorks();
        Assert.assertTrue(homePage.isHowItWorksDisplayed());
    }

    @Test
    public void testAboutPageNavigation() {
        homePage.clickAbout();
        Assert.assertTrue(aboutPage.isMainHeaderDisplayed());
    }

    @Test
    public void testLoginNavigation() {
        homePage.clickLogin();
        Assert.assertTrue(loginPage.isLoginPageLoaded());
    }

    @Test
    public void testVerifyPageOpens(){
        homePage.scrollToVerify();
        homePage.clickVerify();
        Assert.assertTrue(driver.getCurrentUrl().contains("/verify"));
    }

    @Test
    public void testThemeToggleWorks(){

        homePage.toggleTheme();

        Assert.assertTrue(homePage.isDarkModeDisabled());
    }
}
