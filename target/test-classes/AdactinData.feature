
Feature: verify login functionality in adactin application
Scenario Outline: verify login functionaliy for valid username and invalid password
Given user is on adactin login page
When user enters valid "<username>" and invalid "<password>"
And user clicks login button
Then Error page is displayed

Examples:
|username|password|
|bibin|12365g|
|bibin01|nihh12|
|bibin02|5687jkk|
|bibin03|kloiu@31|













