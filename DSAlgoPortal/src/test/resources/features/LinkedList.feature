@DSAlgoLinkedListValidation
Feature: DSAlgo Linked List Module Validation

  @TC_001
  Scenario Outline: User Navigates to DropDown in the LinkedList panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    And user selects LinkedList item from the drop down menu
    Then user should be navigated to LinkedList page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @Tc_002 @IntruductionlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the LinkedList Panel to explore Intruduction link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Intruduction link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_003 @IntruductionlinkInValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the LinkedList Panel to explore Intruduction link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Intruduction link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_004 @CreatingLinkedListlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore CreatingLinkedList link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks CreatingLinkedList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_005 @CreatingLinkedListlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore CreatingLinkedList link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks CreatingLinkedList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_006 @TypesOfLinkedListlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore TypesOfLinkedList link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks TypesOfLinkedList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_007 @TypesOfLinkedListlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore TypesOfLinkedList link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks TypesOfLinkedList link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_008 @ImplimentLinkedListInPythonlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore ImplimentLinkedListInPython link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks ImplimentLinkedListInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_009 @ImplimentLinkedListInPythonlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore ImplimentLinkedListInPython link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks ImplimentLinkedListInPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_008 @TraversallinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Traversal link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Traversal link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_009 @TraversallinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Traversal link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Traversal link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_008 @InsertionlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Insertion link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Insertion link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_009 @InsertionlinkInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Insertion link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Insertion link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |

  @TC_008 @DeletionlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Deletion link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Deletion link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_009 @DeletionInValidPythonCode
  Scenario Outline: User clicks "Get Started" button in LinkedList panel to explore Deletion link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in LinkedList Panel
    Then user clicks Deletion link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
