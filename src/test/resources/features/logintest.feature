Feature: Verify user login and logout successfully

  @Smoke
  Scenario: Verify user should login successfully
    Given User is on homepage
    When User enter the username to login <"Admin">
    And User enter password to login <"admin123">
    And User click on login button
    Then User should verify welcome text

  @Sanity @Regression
  Scenario: Verify the Orange HRM logo is displayed
    Given User is on homepage
    When User enter the username to login <"Admin">
    And User enter password to login <"admin123">
    And User click on login button
    And User should verify welcome text
    Then User should verify that Orange HRM logo is displayed

  @Regression
  Scenario: Verify user logout successfully
    Given User is on homepage
    When User enter the username to login <"Admin">
    And User enter password to login <"admin123">
    And User click on login button
    And User should verify welcome text
    And User click on logout
    Then User should logout successfully <"LOGIN Panel">

  Scenario: Verify error message with invalid credentials
    Given User enters username "1"
    And User enters password "test123@gmail.com"
    When User clicks on login button
    Then Verify error message "Required"