Feature: Registration of a new user
  Description: Registration of users
  @Smoke
  Scenario Outline: Register a new User
    Given I go to loginURL on Browser
    When I click on the New user button
    And I enter all the "<user>" details and click on the Register button
 
    
   Examples:
   |user|
   |TEST03|
   |TEST04|
   
   
