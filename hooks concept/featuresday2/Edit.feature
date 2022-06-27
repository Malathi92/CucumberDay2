Feature: EditLead functionality for leaftabs application

Scenario Outline: Edit lead functionalities
#Given Open the Chrome browser
#And Load the Url <url>
And Enter the valid username <username>
And Enter the valid password <password>
When Click on login button
Then Home page should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the companyName <comName>
Given Enter the firstName <fName>
Given Enter the lastName <lName>
Given Enter the firstlocalName <loName>
Given Enter the Department <dept>
Given Enter the Description <desc>
Given Enter the emailId <email>
Then Click on Dropdown select value
When Click on submit button
Then View Lead page should be displayed
When Click on Edit button
Then Edit screen should be displayed
When Clear the description
Given Enter the importance note <impNote>
When Click on Submit Button



Examples:
|url|username|password|comName|fName|lName|loName|dept|desc|email|impNote|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'TestLeaf'|'MALATHI'|'E'|'local'|'core'|'welcome to test leaf'|'emalathi21@gmail.com'|'importance note'|
|'http://www.leaftaps.com/opentaps'|'Democsr'|'crmsfa'|'wipro'|'Babu'|'M'|'local'|'cse'|'welcome to qeagle'|'babu@gmail.com'|'imp note'|


Scenario: Login with negative credential

#Given Open the Chrome browser
#And Load the Url 'http://www.leaftaps.com/opentaps'
Given Enter the valid username 'Demo'
And Enter the valid password 'crmsfa'
When Click on login button
But Error message should be displayed


