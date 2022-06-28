Feature: CreateLead functionality for leaftabs application
@smoke @sanity
Scenario Outline: Create lead functionalities
#Given Open the Chrome browser
#And Load the Url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed
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

Examples:
|url|username|password|comName|fName|lName|loName|dept|desc|email|
|'http://www.leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|'TestLeaf'|'MALATHI'|'E'|'local'|'core'|'welcome to test leaf'|'emalathi21@gmail.com'|
|'http://www.leaftaps.com/opentaps'|'Democsr'|'crmsfa'|'wipro'|'Babu'|'M'|'local'|'cse'|'welcome to qeagle'|'babu@gmail.com'|

@regression @sanity
Scenario: Login with negative credential

#Given Open the Chrome browser
#And Load the Url 'http://www.leaftaps.com/opentaps'
And Enter the username 'Demo'
And Enter the password 'crmsfa'
When Click on Login button
But Error message should be displayed