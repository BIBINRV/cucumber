Feature: Verify login functionality in adactin hotelapp
Scenario: verify login functionality for valid username and valid password
Given User is on adactin login page
When user enters username and password
And user clicks login button
Then login page is opened
