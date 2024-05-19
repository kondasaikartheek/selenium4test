Feature: Searching on Google

  Scenario: Check login is successful with valid creds
    Given User is on loginpage
    When User enters valid username and password
    And clicks on Login Button
    Then users navigated to Home page
    And close the browser
 