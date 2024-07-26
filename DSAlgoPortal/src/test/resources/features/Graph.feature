@DSAlgoGraphValidation
Feature: DSAlgo Graph Module Validation

  @TC_G1
  Scenario Outline: User Explore DropDownBox Graph panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User selects Graph item from the drop down menu
    Then User should be navigated to Graph Page
    
    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         0 |

  @TC_G2 @GraphlinkValidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Graph Panel to explore Graph link ValidPythonCode
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
      | tryEditor |         1 |

  @TC_G3 @GraphlinkInvalidPythonCode
  Scenario Outline: User clicks the "Get Started" from the Graph Panel to explore Graph link InvalidPythonCode
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
      | tryEditor |         2 |

  @TC_G4 @GraphRepresentationlinkValidPythonCode
  Scenario Outline: User clicks "Get Started" button in Graph panel to explore GraphRepresentations link ValidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks GraphRepresentations link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>

    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         1 |

  @TC_G5 @GraphRepresentationlinkInvalidPythonCode
  Scenario Outline: User clicks "Get Started" button in Graph panel to explore GraphRepresentations link InvalidPythonCode
    Given user navigates to Home page
    And user navigates to Login page
    When user enters sheet '<Sheetname>' and <RowNumber>
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks GraphRepresentations link
    And user clicks tryhere button
    Then user executes code from  sheetname '<Sheetname>' and row number <RowNumber>
    
    Examples: 
      | Sheetname | RowNumber |
      | tryEditor |         2 |
