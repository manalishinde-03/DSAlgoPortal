@DSAlgoDataStructureIntro
Feature: DSAlgo Data Structure Introduction Module Verification

  @TC_DSIntro_01
  Scenario Outline: Verify Navigation to Data Structures-Introduction page
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |


  @TC_02
  Scenario Outline: Validate Time Complexity link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page
    And user clicks on Time Complexity link

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_03
  Scenario Outline: Validate Practice Questions link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page
    And user clicks on Time Complexity link
    And user clicks on Practice Questions link

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_04
  Scenario Outline: Validate Try Here button
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page
    And user clicks on Time Complexity link
    And user clicks on Try Here button on Time Complexity page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_05
  Scenario Outline: Validate Try Editor
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page
    And user clicks on Time Complexity link
    And user clicks on Try Here button on Time Complexity page
    And user executes code from  sheetname "<Sheetname>" and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_06
  Scenario Outline: Validate Try Editor with invalid code
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet "<Sheetname>" and <RowNumber>
    And user clicks on Login button
    Then user navigates to Data Structures-Introduction page
    And user clicks on Time Complexity link
    And user clicks on Try Here button on Time Complexity page
    And user executes code from  sheetname "<Sheetname>" and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
