Feature: Explore Graph Module

  @TC_G1
  Scenario Outline: User Explore DropDownBox Graph panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User selects Graph item from the drop down menu
    Then User should be navigated to Graph Page
    Then User goes to previous page

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_G2 @GraphlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Graph Panel to explore Graph link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks Graph link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         4 |

  @TC_G3 @GraphlinkInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Graph Panel to explore Graph link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks Graph link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

  @TC_G5 @GraphRepresentationlinkInvalidPythonCode
  Scenario Outline: User clicks "Get Started" button in Graph panel to explore GraphRepresentations link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks GraphRepresentations link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>
    #And user write python code and clicks run button and it will display output
    Then user goes to previous page
    Then user clicks signout link
    Then logged out successfully message will be displayed

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         5 |

