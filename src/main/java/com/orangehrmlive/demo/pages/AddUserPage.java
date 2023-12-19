package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

    @FindBy(name = "systemUser[status]")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    public void selectUserRole(String role) {
        Reporter.log("Select role : " + userRoleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRoleDropDown, role);
    }

    public void putEmployeeNameInTheEmployeeNameField(String employeename) {
        Reporter.log("Enter Employee Name : " + employeeName.toString() + "<br>");
        sendTextToElement(employeeName, employeename);
    }

    public void putUserNameInTheUserNameField(String empUserName) {
        Reporter.log("Enter Employee User Name : " + userName.toString() + "<br>");
        sendTextToElement(userName, empUserName);
    }

    public void selectUserStatus(String statusValue) {
        Reporter.log("Select Status : " + statusDropDown.toString() + "<br>");

        selectByVisibleTextFromDropDown(statusDropDown, statusValue);
    }

    public void enterPasswordInThePasswordField(String passWord) {
        Reporter.log("Enter password" + password.toString() + "<br>");
        sendTextToElement(password, passWord);
    }

    public void enterConfirmationPassword(String confirmationPassWord) {
        Reporter.log("Enter confirmation password" + confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, confirmationPassWord);
    }


    public void clickOnTheSaveButton() {
        Reporter.log("Click on the save Button : " + saveButton.toString() + "<br>");
        clickOnElement(saveButton);

    }
}
