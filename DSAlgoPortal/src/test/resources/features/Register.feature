@DSAlgoRegisterFunctionality
Feature: DSAlgo Portal Register Page Verification

  @TC_Register_01
  Scenario Outline: Registration successful with valid credentials
    Given user navigates to Home page
    And user navigates to Register page
    When user enters sheetname "<Sheetname>" and row <RowNumber>
    And user clicks on Register button
   # Then validate the message after registration from sheetname "<Sheetname>" and row <RowNumber> on home page

    Examples: 
      | Sheetname | RowNumber |
      | register  |         0 |

  @TC_1 @Passed
  Scenario Outline: Registration successful with valid credentials
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the <message> on home page after registration for <username>

    Examples: 
      | username        | password  | password confirmation | message                                   |
      | techtitanstest2 | Time2fly$ | Time2fly$             | New Account Created. You are logged in as |

  @TC_2
  Scenario Outline: Register with all fields empty
    Given user navigates to Home page
    And user navigates to Register page
    And user clicks on Register button
    Then validate <tooltip message> on Register page

    Examples: 
      | tooltip message             |
      | Please fill out this field. |

  @TC_3
  Scenario Outline: Register with only username
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user clicks on Register button
    Then validate <tooltip message> on Register page

    Examples: 
      | username       | tooltip message             |
      | techtitanstest | Please fill out this field. |

  @TC_4
  Scenario Outline: Register with password confirmation field empty
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate <tooltip message> on Register page

    Examples: 
      | username       | password  | password confirmation | tooltip message             |
      | techtitanstest | Time2fly$ |                       | Please fill out this field. |

  @TC_5
  Scenario Outline: Register with invalid Username
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the error <message> on Register page for invalid data

    Examples: 
      | username | password  | password confirmation | message                                                 |
      | #        | Time2fly$ | Time2fly$             | password_mismatch:The two password fields didn’t match. |

  @TC_6
  Scenario Outline: Register with password fields mismatch
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the error <message> on Register page for invalid data

    Examples: 
      | username       | password  | password confirmation | message                                                 |
      | techtitanstest | Time2fly$ | Time2fly              | password_mismatch:The two password fields didn’t match. |

  @TC_7
  Scenario Outline: Register with password less than 8 characters
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the error <message> on Register page for invalid data

    Examples: 
      | username       | password | password confirmation | message                                                 |
      | techtitanstest | Time     | Time                  | password_mismatch:The two password fields didn’t match. |

  @TC_8
  Scenario Outline: Register with only numeric password more than 8 characters
    Given user navigates to Home page
    And user navigates to Register page
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the error <message> on Register page for invalid data

    Examples: 
      | username       | password    | password confirmation | message                                                 |
      | techtitanstest | 12345678901 |           12345678901 | password_mismatch:The two password fields didn’t match. |

  @TC_9
  Scenario: Login link on Register page
    Given user navigates to Home page
    And user navigates to Register page
    Then user clicks on Login link
