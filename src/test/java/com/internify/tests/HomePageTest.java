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

        Assert.assertEquals(
                loginPage.getMainHeaderText(),
                "WELCOME BACK"
        );
    }

    @Test
    public void testSignUpNavigation() {
        homePage.clickSignUp();

        Assert.assertTrue(signUpPage.isSignUpPageLoaded());

        Assert.assertEquals(
                signUpPage.getMainHeaderText(),
                "JOIN INTERNIFY"
        );
    }

    @Test
    public void testVerifyPageOpens() {
        homePage.scrollToVerify();
        homePage.clickVerify();

        Assert.assertTrue(
                verifyPage.isVerifyPageLoaded()
        );

        Assert.assertEquals(
                verifyPage.getMainHeaderText(),
                "VERIFY A CERTIFICATE"
        );
    }


    @Test
    public void testValidCertificateID() {
        homePage.scrollToVerify();
        homePage.clickVerify();

        verifyPage.enterCertificateId("INF-2026-9LUGTK");
        verifyPage.clickVerifyButton();

        Assert.assertEquals(
                verifyPage.getVerifiedHeaderText(),
                "VERIFIED CERTIFICATE"
        );

        Assert.assertEquals(
                verifyPage.getDisplayedCertificateId(),
                "INF-2026-9LUGTK"
        );
    }

    @Test
    public void testInvalidCertificateID() {
        homePage.scrollToVerify();
        homePage.clickVerify();

        verifyPage.enterCertificateId("LOL");
        verifyPage.clickVerifyButton();

        Assert.assertEquals(
                verifyPage.getInvalidCertificateErrorText(),
                "NOT VERIFIED"
        );
    }

    @Test
    public void testThemeToggleWorks() {
        homePage.toggleTheme();

        Assert.assertTrue(
                homePage.isDarkModeDisabled()
        );
    }
}