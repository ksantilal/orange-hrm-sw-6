package com.orangehrmlive.demo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @When("User enter the username to login <{string}>")
    public void userEnterTheUsernameToLogin(String arg0) {
    }

    @And("User enter password to login <{string}>")
    public void userEnterPasswordToLogin(String arg0) {
    }

    @And("User click on login button")
    public void userClickOnLoginButton() {
    }

    @Then("User should verify welcome text")
    public void userShouldVerifyWelcomeText() {
    }

    @Then("User should verify that Orange HRM logo is displayed")
    public void userShouldVerifyThatOrangeHRMLogoIsDisplayed() {
    }

    @And("User click on logout")
    public void userClickOnLogout() {
    }

    @Then("User should logout successfully <{string}>")
    public void userShouldLogoutSuccessfully(String arg0) {
    }

    @Given("User enters username {string}")
    public void userEntersUsername(String arg0) {
    }

    @And("User enters password {string}")
    public void userEntersPassword(String arg0) {
    }

    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
    }

    @Then("Verify error message {string}")
    public void verifyErrorMessage(String arg0) {
    }
}
