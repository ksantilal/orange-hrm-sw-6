package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement orangeHRMLogo;

    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement admin;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;


    public void verifyTheOrangeHRMLogo(String welcomeMessageIsDisplayedIncorrectly, WebElement welcomeText) {
        Reporter.log("Verifying the logo : " + orangeHRMLogo.toString() + "<br>");
        boolean logoPresent = orangeHRMLogo.isDisplayed();
        Assert.assertTrue(logoPresent);
    }

    public void clickOnAdminTabFromHomePage() {
        Reporter.log("Click on Admin Tab From Homepage : " + admin.toString() + "<br>");
        clickOnElement(admin);
    }

    public void verifyTheWelcomeMessage() {
        Reporter.log("Verifying the message : " + welcomeText.toString() + "<br>");
        String s1 = "Welcome Paul";
        String expectedMessage = s1.substring(0, 6);
        String s2 = getTextFromElement(welcomeText);
        String actualMessage = s2.substring(0, 6);
        verifyTheOrangeHRMLogo("Welcome Message is displayed incorrectly", welcomeText);
    }
}
