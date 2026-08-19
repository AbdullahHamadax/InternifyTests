package com.internify.pages;

import org.openqa.selenium.By;

public class VerifyPage extends BasePage {

    private final By mainHeader = By.tagName("h1");
    private final By certificateID = By.id("certificateId");
    private final By invalidCertificateError = By.tagName("h2");
    private final By verifyButton = By.tagName("button");

    private final By verifiedHeader =
            By.xpath("//*[contains(text(),'VERIFIED CERTIFICATE')]");

    private final By displayedCertificateId =
            By.xpath("//*[contains(text(),'INF-2026-9LUGTK')]");


    public String getMainHeaderText() {
        return find(mainHeader).getText();
    }

    public boolean isVerifyPageLoaded() {
        return urlContains("/verify");
    }

    public void clickVerifyButton(){
        click(verifyButton);
    }

    public void enterCertificateId(String id){
        set(certificateID, id);
    }

    public String getInvalidCertificateErrorText() {
        return find(invalidCertificateError).getText();
    }

    public String getVerifiedHeaderText() {
        return find(verifiedHeader).getText();
    }

    public String getDisplayedCertificateId() {
        return find(displayedCertificateId).getText();
    }
}


