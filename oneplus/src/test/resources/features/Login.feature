
Feature: Login to SwagLabsApp

  Scenario: Successful login with valid credentials
    Given the user is on the mobile login page
    When the user enters a valid username
    And the user enters a valid password
    And the user taps on the Login button
    #Then the user should be redirected to the account overview page