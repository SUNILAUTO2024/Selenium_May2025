
@login_regression
  Feature: Login Feature

    @_Valid_login
    Scenario: Valid login

      Given user is navigate to login page
      When enter valid credentials
      Then user should be naviate to homepage


      @invalid_login
    Scenario: IN_Valid login

      Given user is navigate to login page
      When enter invalid_valid credentials
      Then user should be naviate to homepage

@verify_static_Elements
    Scenario: verify login page static texts

      Given user is navigate to login page
      When verify logo exist or not
      Then username password icons and values present or not
      And verify appearance of links
      And Verify social media handles