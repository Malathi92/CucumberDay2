Feature: MergeContact functionality for leaftabs application
@smoke
Scenario Outline: Merge contact functionalities
#Given Open the Chrome browser
#And Load the Url <url>
Given Enter the valid username <username>
And Enter the valid password <password>
When Click on login button
Then Home page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Contacts' link
Then 'Contacts' page should be displayed
When Click on 'Merge Contacts' link
Then 'Merge Contacts' page should be displayed
When Click on first lead
When click on second lead
When Click on Merge button
Then Alert box should be displayed

Examples:
|url|username|password|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|

@sanity @regression
Scenario: Login with negative credential

#Given Open the Chrome browser
#And Load the Url 'http://www.leaftaps.com/opentaps'
Given Enter the valid username 'Demo'
And Enter the valid password 'crmsfa'
When Click on login button
But Error message should be displayed