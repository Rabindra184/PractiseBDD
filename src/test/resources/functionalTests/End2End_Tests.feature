Feature: Automated End2End Tests
Description:The purpose of the scenario to test end to End Test Flows.

@Regression
Scenario: Customer is adding books to the profile and then removing it from profile
 

Given I go to loginURL on Browser
And I enter loginusername as Username
And I enter loginpassword as Password
And I click on loginButton
And I click on the GotoBook Store
And I click on the book link
And I click on the AddtoyourCollection button
And I click on the Profile
And I Click on the DellAllBooks button
And I click on the Logout button


