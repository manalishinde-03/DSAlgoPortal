@DSAlgoHomePageValidation
Feature: DSAlgo Portal Home Page Verification

  @TC01
  Scenario: Home page navigation
    Given user navigates to Home page

  @TC02
  Scenario: Home page -Data Structures Dropdown
    Given user navigates to Home page
    Then user clicks Data Structures dropdown and able to see all options

  @TC03
  Scenario: Home page -Register link
    Given user navigates to Home page
    Then user clicks Register link and navigates to Register page

  @TC04
  Scenario: Home page -Sign In link
    Given user navigates to Home page
    Then user clicks Sign-in link and navigates to Login page

  @TC05 @Failed
  Scenario Outline: Home page -Get Started button below Data Structure topic
    Given user navigates to Home page
    Then user clicks on Get Started button below any Data Structure topic
    And user not logged in <warning message> should be displayed

    Examples: 
      | warning message       |
      | You are not logged in |
