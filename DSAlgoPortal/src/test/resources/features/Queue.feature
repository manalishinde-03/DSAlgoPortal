@DSAlgoQueueValidation
Feature: DSAlgo Queue Module Validation

  @TC_001
  Scenario Outline: User Navigates to DropDown in the Queue panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    And user selects Queue item from the drop down menu
    Then user should be navigated to Queue page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @Tc_002 @ImplementationOfQueueInPythonlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Queue Panel to explore ImplementationOfQueueInPython link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationOfQueueInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_003 @ImplementationOfQueueInPythonlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Queue Panel to explore ImplementationOfQueueInPython link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationOfQueueInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_004 @ImplementationUsingCollectionQueuelinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore ImplementationUsingCollectionQueue link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationUsingCollectionQueue link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_005 @ImplementationUsingCollectionQueuelinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore ImplementationUsingCollectionQueue link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationUsingCollectionQueue link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_006 @ImplementationUsingArraylinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore ImplementationUsingArray link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationUsingArray link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_007 @ImplementationUsingArraylinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore ImplementationUsingArray link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationUsingArray link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_006 @QueueOperationslinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore QueueOperations link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks ImplementationUsingArray link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_007 @QueueOperationslinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Queue panel to explore QueueOperations link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Queue Panel
    Then user clicks QueueOperations link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
