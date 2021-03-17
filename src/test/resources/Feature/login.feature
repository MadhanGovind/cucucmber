Feature: To validate Adactin Hotel

  

  Scenario: To validate adactin login functionality
    Given user in adactin login page
    When User enter invaliid username and password
      | username | java     |
      | passcode | java@123 |
    And User click login button
    Then I validate the outcomes
