Feature: To validate the Adactin ticket booking functionality
Background:
Given User in Adactin Hotel login page

  Scenario Outline: To validate login using valid credentials
    When user enter valid "<username>" and "<password>"
    And User click login button
    When user select location,Hotel,roomtype,No of Rooms and "<dateIn>" and "<dateout>" and adult
    And user click search button
    When User select RadioButton and click Continue
    And User enter "<firstname>" and "<lastnamee>" and "<address>"and "<creditcardNo>" and credittype and expmonth and expyear "<cvv>" and click booknow
    Then user check orderno lungthb is ten

    Examples: 
      | username     | password  | dateIn     | dateout    | firstname | lastnamee | address | creditcardNo     | cvv |
      | MadhanGovind | Madhan@21 | 09/03/2021 | 11/03/2021 | Madhan    | Govind    | Hosur   | 1234567891234567 | 123 |

      
      