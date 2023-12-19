Feature: User Management

  Scenario Outline: Admin should add user successfully
    Given User navigates to the OrangeHRM application
    When User enters username as "<username>" and password as "<password>"
    Then User is able to login to the application

    When User clicks on the Admin tab
    And User clicks on the Add button
    Then User should be navigated to the Add User page

    When User enters employee name as "<employeeName>"
    And User selects user role as "<userRole>"
    And User enters username as "<username>"
    And User selects status as "<status>"
    And User enters password as "<password>" and confirms password as "<password>"
    And User clicks on the Save button
    Then User should see the message "Successfully Saved"

    Examples:
      | username | password | employeeName | userRole | status |
      | ananyadash | password | Ananya Dash | Admin | Disable |

  Scenario Outline: Search the user created and verify it
    Given User is logged in to the OrangeHRM application
    When User clicks on the Admin tab
    Then User should see the "System Users" text

    When User clicks on the Search button
    And User enters username as "<username>"
    When User clicks on the Search button
    Then User should see the user "<username>" in the result list
    And User should see the employee name as "Ananya Dash"

    Examples:
      | username |
      | ananyadash |

  Scenario Outline: Verify that Admin should delete the user successfully
    Given User is logged in to the OrangeHRM application
    And User clicks on the Admin tab
    Then User should see the "System Users" text

    When User clicks on the Search button
    And User enters username as "<username>"
    When User clicks on the Search button
    And User selects the checkbox next to the user "<username>"
    And User clicks on the Delete button
    Then User should see a confirmation popup

    When User clicks on the Ok button in the popup
    Then User should see the message "Successfully Deleted"

    Examples:
      | username |
      | ananyadash |

  Scenario Outline: Search the user and verify the message "Record Found"
    Given User is logged in to the OrangeHRM application
    When User clicks on the Admin tab
    Then User should see the "System Users" text
    When User clicks on the Search button
    And User enters username as "<username>"
    And User selects user role as "<userRole>"
    And User enters employee name as "<employeeName>"
    And User selects status as "<status>"
    When User clicks on the Search button
    Then User should see the message "(1) Record Found"

    Examples:
      | username | userRole | employeeName | status |
      | Admin  | Admin | Paul Collings | Enable |
      | Cassidy.Hope  | ESS | Cassidy Hope | Enable |
      | Nina.Patel | ESS | Nina Patel | Enable |
      | Odis.Adalwin  | Admin | Odis Adalwin|Enable|