@TreeModule
Feature: Explore Tree Module

  @DropboxTree
  Scenario Outline: User Explore DropDownBox Tree panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user selects Tree from the drop down menu
    Then user navigated to Tree Page
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @OverviewofTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks OverviewofTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @Terminologies
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Terminologies link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @TypesofTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @TreeTraversals
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TreeTraversals link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @Traversal-Illustration
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks Traversals-Illustration link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @BinaryTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @TypesofBinaryTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks TypesofBinaryTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @ImplementationinPython
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationinPython link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @BinaryTreeTraversals
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinaryTreeTraversals link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @ImplementationofBinaryTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplementationofBinaryTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @ApplicationsofBinaryTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ApplicationsofBinaryTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @BinarySearchTrees
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks BinarySearchTrees link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @ImplemenationOfBST
  Scenario Outline: User clicks the "Get Started" from the Tree Panel to explore Tree link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When user clicks the GetStarted button in Tree Panel
    Then user clicks ImplemenationOfBST link
    And user clicks tryhere button
    Then user should be directed to tryEditor write non python code and clicks run button
    And user write python code and clicks run button and it will display output
    Then user goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |
