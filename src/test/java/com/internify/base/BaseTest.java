package com.internify.base;

import com.internify.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected AboutPage aboutPage;
    protected VerifyPage verifyPage;
    protected LoginPage loginPage;
    protected String url = "https://internify-one.vercel.app/";


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
        aboutPage = new AboutPage();
        verifyPage = new VerifyPage();
        loginPage = new LoginPage();
    }


    @AfterMethod
    public void tearDown(){
//        driver.quit();
    }
}
