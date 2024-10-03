@Amazonchk
Feature: This feature file is to test the amazon Homepage feature functionality

Background: 
Given Launch the browser and load amazon url

Scenario: This scenario is to test the Mobile search functionality
  When Search with mobile option in homepage
  Then Validate if mobile lists opened sucessfully and close the browser
  
  Scenario: This scenario is to test the Smart Wathces search functionality
  When Search with smartwatches option in homepage
  Then Validate if mobile lists opened sucessfully and close the browser
  
  Scenario: This scenario is to test the Speakers search functionality
  When Search with speakers option in homepage
  Then Validate if mobile lists opened sucessfully and close the browser