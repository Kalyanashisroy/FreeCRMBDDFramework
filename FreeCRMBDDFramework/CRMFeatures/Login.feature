Feature: Free CRM Login Feature

#Without Examples keyword
#Scenario: Free CRM Login Test Scenario
#Given user is already on login page
#When title of login page is free CRM
#Then user enter "kgec.kr@gmail.com" and "Kcrm$123456"
#Then user click on login button
#And user is on home page

#With Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is free CRM
Then user enter "<username>" and "<password>"
Then user click on login button
Then user is on home page
Then close the browser

Examples:
	|username          | password   |
	|kgec.kr@gmail.com | Kcrm$123456|
	|  John            | test456    |
	
#Scenario Outline: Free CRM Create a new contacts
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "<username>" and "<password>"
#Then user click on login button
#Then user is on home page
#Then user moves to new contact page
#Then user enters contacts details"<firstname>" and "<lastname>" and "<position>"
#Then close the browser
#
#Examples:
#        |username|password|firstname|lastname|position|
#        |kgec.kr@gmail.com|Kcrm$123456|Tom|Peter|Manager|
#        |kgec.kr@gmail.com|Kcrm$123456|David|Dzousa|Director|
#	
	
	


#Scenario: user is able to create new contacts
#Given user is already on home page 
#When user mouse over on contact link
#Then user click on new contact link
#Then user enters firstname and last name
#Then user click on save button
#Then verify new contact created
