Feature: Searching on Google Chrome

  Scenario: Check and fill the details
    Given user navigate to main url
    When user book an appointment
    And User enters dubulicate valid username and password
    Then user click on login
    And user fill all details
    And user click on book appointment
    Then user return to home page
