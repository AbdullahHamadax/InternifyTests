package com.internify.pages;

public class LoginPage extends BasePage {
    public boolean isLoginPageLoaded() {
        return urlContains("/login");
    }

}
