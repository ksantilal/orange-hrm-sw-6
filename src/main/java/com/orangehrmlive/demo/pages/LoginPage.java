package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {


    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginButton;

    @FindBy(id = "logInPanelHeading")
    WebElement loginPanelText;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterTheUsernameInTheUsernameField(String username) {
        // Reporter.log("Entering the username : " + userName.toString() + "<br>");
        sendTextToElement(userName, username);
    }

    public void enterThePasswordInThePasswordField(String passWord) {
        Reporter.log("Entering the password : " + password.toString() + "<br>");
        sendTextToElement(password, passWord);
    }

    public void clickOnTheLoginButton() {
        Reporter.log("clicking on the login button : " + loginButton.toString() + "<br>");
        clickOnElement(loginButton);
    }

    public void verifyTheLoginPanelText(String loginPanel, WebElement loginPanelText) {
        Reporter.log("Verifying the login panel text : " + this.loginPanelText.toString() + "<br>");
        verifyTheLoginPanelText("LOGIN Panel", this.loginPanelText);

    }
}
