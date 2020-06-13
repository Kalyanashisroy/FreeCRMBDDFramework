Feature: Free CRM Create Contacts


Scenario Outline: Free CRM Create a new contacts

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
Then user is on home page
Then user moves to new contact page
Then user enters contacts details"<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
        |username|password|firstname|lastname|position|
        |kgec.kr@gmail.com|Kcrm$123456|Tom|Peter|Manager|
        |kgec.kr@gmail.com|Kcrm$123456|David|Dzousa|Director|