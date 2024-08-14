@Simple 
Feature: Simple Form Submission
 

  @positive
  Scenario: To validate the Simple form functionality
    Given open the browser, enter the Simple form url
    When user enters the valid first name
    And user enters the valid last name
    And user enters the valid email
    And user enters the valid contact number
    And user enters a message in the message field
    Then user clicks on the submit button
    And Thank you message should be displayed