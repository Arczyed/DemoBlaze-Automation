Feature: User Registration on DemoBlaze

  Scenario: User successfully register an account
    Given User is on demoblaze homepage
    And user has click on SignUp button
    And Register modal is shown
    When user fill username and password field with "DemoAccount27"
    And user submit registration form
    Then user can see successfull registration message

   Scenario: User cant register with registered account
     Given User is on demoblaze homepage
     And user has click on SignUp button
     And Register modal is shown
     When user fill username and password field with existing account
     And user submit registration form
     Then user will see a popup message
