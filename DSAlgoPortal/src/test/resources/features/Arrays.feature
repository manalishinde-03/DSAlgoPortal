@DSAlgoArrayValidation
Feature: DSAlgo Array Module Validation

  @TC_001
  Scenario Outline: User Navigates to DropDown in the Array panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    And user selects Array item from the drop down menu
    Then user should be navigated to Array page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @Tc_002 @ArraysInPythonlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Array Panel to explore ArraysInPython link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ArraysInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_003 @ArraysInPythonlinkInValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Array Panel to explore ArraysInPython link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ArraysInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_004 @ArraysUsingListlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore ArraysUsingList link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ArraysUsingList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_005 @ArraysUsingListlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore ArraysUsingList link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ArraysUsingList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_006 @BasicOperationsUsingListlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore BasicOperationsUsingList link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks BasicOperationsUsingList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_007 @BasicOperationsUsingListlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore BasicOperationsUsingList link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks BasicOperationsUsingList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_008 @ApplicationsOfArrayslinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore ApplicationsOfArrays link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ApplicationsOfArrays link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_009 @ApplicationsOfArrayslinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Array panel to explore ApplicationsOfArrays link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Array Panel
    Then user clicks ApplicationsOfArrays link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
