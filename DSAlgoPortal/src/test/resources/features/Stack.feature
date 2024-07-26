@DSAlgoStackValidation
Feature: DSAlgo Stack Module Validation

  @TC_001
  Scenario Outline: User Navigates to DropDown in the Stack panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    And user selects Stack item from the drop down menu
    Then user should be navigated to Stack page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @Tc_002 @OperationsInStacklinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Stack Panel to explore OperationsInStack link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks OperationsInStack link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_003 @OperationsInStackInValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Stack Panel to explore OperationsInStack link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks OperationsInStack link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_004 @ImplementationlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Stack panel to explore Implementation link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks Implementation link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_005 @ImplementationlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Stack panel to explore Implementation link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks Implementation link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_006 @ApplicationstlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Stack panel to explore Applications link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks Applications link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_007 @ApplicationslinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Stack panel to explore Applications link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Stack Panel
    Then user clicks Applications link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
