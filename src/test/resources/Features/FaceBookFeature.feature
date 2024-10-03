Feature: This feature is to verify signup functionality

Scenario: This scenario is to test facebook signup function
Given Launch browser and load facebookurl
When Click on signup button and enter required details
|Kishore|
|Sridhar|
|9500249985|
|Tommy@123|
|14|
|2|
|1991|
|Male|
Then Validate weather signup page is sucessfully and close browser
