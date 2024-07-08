@DSAlgoRegisterFunctionality
Feature: DSAlgo Portal Register Page Verification

  @TC_Register_01
  Scenario Outline: Registration successful with valid credentials
    Given user navigates to Home page
    And user navigates to Register page
    When user fills registration form from sheetname "<Sheetname>" and row <RowNumber>
    And user clicks on Register button
    Then validate the message after registration from sheetname "<Sheetname>" and row <RowNumber> on home page

    Examples: 
      | Sheetname | RowNumber |
      | register  |         0 |

  @TC_Register_02
  Scenario Outline: Register with empty fields
    Given user navigates to Home page
    And user navigates to Register page
    When user fills registration form from sheetname "<Sheetname>" and row <RowNumber>
    And user clicks on Register button
    Then Tooltip error validation from sheetname "<Sheetname>" and row <RowNumber> on Register page

    Examples: 
      | Sheetname | RowNumber |
      | register  |         1 |
      | register  |         2 |
      | register  |         3 |

  @TC_Register_03
  Scenario Outline: Register with invalid data
    Given user navigates to Home page
    And user navigates to Register page
    When user fills registration form from sheetname "<Sheetname>" and row <RowNumber>
    And user clicks on Register button
    Then verify error for invalid data from sheetname "<Sheetname>" and row <RowNumber> on Register page

    Examples: 
      | Sheetname | RowNumber |
      | register  |         4 |
      | register  |         5 |
      | register  |         6 |
      | register  |         7 |

  @TC_Register_04
  Scenario: Login link on Register page
    Given user navigates to Home page
    And user navigates to Register page
    Then user clicks on Login link
