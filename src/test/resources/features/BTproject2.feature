Feature: Searching on Google Chrome

Background:
Given user navigate to url

  Scenario Outline: Check and fill the details
  When user enters name as "<username>"
  And user enters email as "<email>"
  And user enters phone "<phone>"
  And user enters address "<address>"
  And user click gender
  And user select days  
  And user selects Country "<Country>"
  Then user selects colour "<colour>"
  And user selects date "<date>"
  
  Examples:
    | username   | email 					| phone		| address |  Country| colour| date			|
    | testuser_1 | abcd@gmail.com | 12345678| hyderabad|	India | Red		|	07/11/1997|
    
  
   Scenario: Check and fill the details write automate
  And user selects product
  Then user selects window
  And user selects Alert ConfirmBox Prompt
  And user Double Click
  Then user Drag and drop the box
  Then user eneters into Frames 
  And user enters framename
  And user enters Gender
  And user enters Dob
  And user enters Job
  
  
  