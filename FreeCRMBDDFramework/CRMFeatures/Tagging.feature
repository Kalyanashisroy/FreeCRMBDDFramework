@FunctionalTest
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and incorrect password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact 
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal 
Given This is a deal test case

@RegressionTest
Scenario: Create a task 
Given This is a task test case

@SmokeTest
Scenario: Create a case 
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given Clicking on left panel 

@SmokeTest
Scenario: Search a deal 
Given This is a search deal test

@SmokeTest
Scenario: Search a contact 
Given This is a search contact test

@SmokeTest @RegressionTest
Scenario: Search a case 
Given This is a search case test

@SmokeTest @RegressionTest
Scenario: Search a task 
Given This is a search task test

@SmokeTest @EndToEnd
Scenario: Search a call 
Given This is a search call test

@SmokeTest @EndToEnd
Scenario: Search an email 
Given This is a search email test

@SmokeTest @EndToEnd
Scenario: Search a docs 
Given This is a search docs test

@SmokeTest @EndToEnd
Scenario: Search a forms 
Given This is a search forms test

@EndToEnd
Scenario: Validate a report
Given This is a report test

@EndToEnd
Scenario: Application logout 
Given This is a logout test

Scenario: browser closed 
Given This is a browser closed test










