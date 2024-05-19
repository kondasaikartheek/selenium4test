Feature: Searching on Google Chrome

  Scenario: Check and fill the details
  
  Given user navigate to url
  When user enters name as "test"
  And user enters email as "saikartheek@gmail.com"
  And user enters phone 1234
  And user enters address "hyderabad"
  And user click gender
  And user select days  
  And user selects Country "India"
  Then user selects colour "Red"
  And user selects date "07/11/1996"
  
   Scenario: Check and fill the details write automate
     Given user navigate to url
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
  
  
  