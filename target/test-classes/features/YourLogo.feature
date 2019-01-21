Feature: Verify YourLogo website functionality

  @NewAccount  @Regression
  Scenario: Create a new account
    Given A practice website is up and running
    When  Submit the user data for registration
    Then User should be created with confirmation message
    And My account page should display user name

  @ExistingUser @Regression
  Scenario: Login with existing user details
    Given A practice website is up and running
    And Provided the existing user login details
    When tried to login with provided credentials
    Then User should login successfully

  @ExpensiveDress @Regression
  Scenario: Search for an expensive dress
    Given A practice website is up and running
    And Provided the existing user login details
    And tried to login with provided credentials
    When Search for an expensive dress
    Then Able to add it to Cart

  @Cart @Regression
  Scenario: Logback and check the cart
    Given A practice website is up and running
    And Provided the existing user login details
    When tried to login with provided credentials
    Then the cart has saved things after logout and Login

