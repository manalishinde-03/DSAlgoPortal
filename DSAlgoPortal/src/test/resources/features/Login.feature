@DSAlgoLoginFunctionality
Feature: DSAlgo Portal Login Verification

  @TC_Login_01
  Scenario Outline: Sign In successful with valid credentials
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then validate the message from sheet "<Sheetname>" and <RowNumber> on home page

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
      | login     |         1 |

  @TC_Login_02
  Scenario Outline: Validate Sign In with empty credentials
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then verify the error message from sheet "<Sheetname>" and <RowNumber> on Login page

    Examples: 
      | Sheetname | RowNumber |
      | login     |         2 |
      | login     |         3 |

  @TC_Login_03
  Scenario Outline: Validate Sign In with invalid credentials
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then verify error for invalid data from sheet "<Sheetname>" and <RowNumber> on Login page

    Examples: 
      | Sheetname | RowNumber |
      | login     |         4 |
      | login     |         5 |

  #@TC_001
  #Scenario Outline: Sign In successful with valid credentials
  #Given user navigates to Home page
  #And user navigates to Login page
  #When user enters <username> and <password> on Login page
  #And user clicks on Login button
  #Then validate the <message> on home page
  #And validate the <username> and sign out button display on Home page
  #
  #Examples:
  #| username   | password  | message           |
  #| techtitans | Time2fly$ | You are logged in |
  #
  #@TC_002
  #Scenario Outline: Sign in with Username field empty
  #Given user navigates to Home page
  #And user navigates to Login page
  #When user enters <username> and <password> on Login page
  #And user clicks on Login button
  #Then validate the <error message> on Login page
  #
  #Examples:
  #| username | password  | error message               |
  #|          | Time2fly$ | Please fill out this field. |
  #
  #@TC_003
  #Scenario Outline: Sign in with Password field empty
  #Given user navigates to Home page
  #And user navigates to Login page
  #When user enters <username> and <password> on Login page
  #And user clicks on Login button
  #Then validate the <error message> on Login page
  #
  #Examples:
  #| username   | password | error message               |
  #| techtitans |          | Please fill out this field. |
  #
  #@TC_004
  #Scenario Outline: Sign in with invalid username and valid password
  #Given user navigates to Home page
  #And user navigates to Login page
  #When user enters <username> and <password> on Login page
  #And user clicks on Login button
  #Then validate the <error message> on Login page for invalid credential
  #
  #Examples:
  #| username     | password  | error message                 |
  #| techtitans12 | Time2fly$ | Invalid Username and Password |
  #
  #@TC_005
  #Scenario Outline: Sign in with invalid password and valid username
  #Given user navigates to Home page
  #And user navigates to Login page
  #When user enters <username> and <password> on Login page
  #And user clicks on Login button
  #Then validate the <error message> on Login page for invalid credential
  #
  #Examples:
  #| username   | password   | error message                 |
  #| techtitans | Time2fly$1 | Invalid Username and Password |
  
  @TC_006
  Scenario: Verify Register link on Login page
    Given user navigates to Home page
    And user navigates to Login page
    Then user clicks on Register link on Login page
