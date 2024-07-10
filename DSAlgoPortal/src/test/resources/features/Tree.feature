@TreeModule
Feature: Explore Tree Module

  @TC_T1 @DropboxTree
  Scenario Outline: User Explore DropDownBox Tree panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user selects Tree from the drop down menu
    Then user navigated to Tree Page
    Then user goes to previous page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_T2 @OverviewofTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks OverviewofTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T3 @OverviewofTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks OverviewofTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T4 @TerminologiesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Terminologies link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T5 @TerminologiesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Terminologies link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T6 @TypesofTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T7 @TypesofTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_08 @TreeTraversalsValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TreeTraversals link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_09 @TreeTraversalsInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TreeTraversals link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T10 @Traversal-IllustrationValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Traversals-Illustration link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T11 @Traversal-IllustrationInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Traversals-Illustration link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T12 @BinaryTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T13 @BinaryTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T14 @TypesofBinaryTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T15 @TypesofBinaryTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T16 @ImplementationinPythonValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationinPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T17 @ImplementationinPythonInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationinPython link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T18 @BinaryTreeTraversalsValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTreeTraversals link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T19 @BinaryTreeTraversalsInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTreeTraversals link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T20 @ImplementationofBinaryTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T21 @ImplementationofBinaryTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T22 @ApplicationsofBinaryTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ApplicationsofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T23 @ApplicationsofBinaryTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ApplicationsofBinaryTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T24 @BinarySearchTreesValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinarySearchTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T25 @BinarySearchTreesInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinarySearchTrees link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_T26 @ImplemenationOfBSTValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplemenationOfBST link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_T27 @ImplemenationOfBSTInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplemenationOfBST link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |
