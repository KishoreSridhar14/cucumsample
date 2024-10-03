@Demo
Feature: This feature file is to test the loginpage scenarios

Scenario: This scenario is to test login functionality
Given Launch browser and load url
When Provide valid username and password then hit login
Then validate whether loggedin sucessesfully and close browser

Scenario Outline: This is to test the login functionality 
Given Launch browser and load url
When Provide valid "<Username>" and "<Password>" then hit login
Then validate whether loggedin sucessesfully and close browser

Examples:
|Username|Password|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|error_user|secret_sauce|