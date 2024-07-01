Feature: Explore Graph Module

  @DropboxGraph
  Scenario Outline: User Explore DropDownBox Graph panel
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When User selects Graph item from the drop down menu
    Then User should be navigated to Graph Page
    Then User goes to previous page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @GettingStartedGraph
  Scenario Outline: User clicks the "Get Started" from the Graph Panel to explore Graph link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks Graph link
    And Graph user clicks tryhere button
    Then Graph user should be directed to tryEditor write non python code and clicks run button
    And Graph user write python code and clicks run button and it will display output
    Then Graph user goes to previous page
    Then Graph user goes back to graph page
    Then Graph user goes back to home page

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |

  @GettingStartedGraphRepresentation
  Scenario Outline: User clicks "Getting Started" button in Graph panel to explore GraphRepresentations link
    Given user navigates to Home page
    And user navigates to Login page
    When user enters <username> and <password> on Login page
    And user clicks on Login button
    When User clicks the GetStarted button in Graph Panel
    Then User clicks GraphRepresentations link
    And Graph user clicks tryhere button
    Then Graph user should be directed to tryEditor write non python code and clicks run button
    And Graph user write python code and clicks run button and it will display output
    Then Graph user goes to previous page
    Then user clicks signout link
    Then logged out successfully message will be displayed

    Examples: 
      | username   | password  |
      | techtitans | Time2fly$ |
