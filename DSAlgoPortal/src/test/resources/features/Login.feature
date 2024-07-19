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

  @TC_Login_04
  Scenario: Verify Register link on Login page
    Given user navigates to Home page
    And user navigates to Login page
    Then user clicks on Register link on Login page

  @TC_Login_05
  Scenario Outline: Verify Sign Out
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user clicks signout link
    Then log out successful <logout message> message will be displayed

    Examples: 
      | Sheetname | RowNumber | logout message          |
      | login     |         0 | Logged out successfully |

  @TC_Login_06
  Scenario Outline: Verify navigation to data structure modules from dropdown
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures module <module> from dropdown options

    Examples: 
      | Sheetname | RowNumber | module      |
      | login     |         0 | Arrays      |
      | login     |         0 | Linked List |
      | login     |         0 | Stack       |
      | login     |         0 | Queue       |
      | login     |         0 | Tree        |
      | login     |         0 | Graph       |

  @TC_Login_07
  Scenario Outline: Verify navigation to Landing Page from data structure pages
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user goes to module Data Structures-Introduction
    And user clicks NumpyNinja link

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
