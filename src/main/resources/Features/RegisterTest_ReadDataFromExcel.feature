
@Register   #This is tag#Scenario level tag, feature level tag
   @ReadDataFromExcel
Feature: Register
  #Background:
  #  Given User clicks on Home Page - Before ech scenario or scenario outline executes

 Scenario: Register Testing

    #pre-reqiuisite
    Given user is on Register Page
    #Action
    When users enters FirstName, LastName, UserName, Password, 1

    And user clicks on Register
    Then user should register successfully
    Given User clicks on Form Menu
