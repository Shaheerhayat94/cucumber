#This is written for training purpose
Feature: Login into Salesforce application

  Scenario: Login with valid Username and password
    Given user launch the salesforce application
    When User enters the username
    And user enters the pasword
    Then click on login button
    Then verify user succesfully logged in

