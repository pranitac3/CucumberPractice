
@Register   #This is tag#Scenario level tag, feature level tag
Feature: Register
  #Background:
  #  Given User clicks on Home Page - Before ech scenario or scenario outline executes

 Scenario Outline: Register Testing

    #pre-reqiuisite
    Given user is on Register Page
    #Action
    When users enters "<FirstName>", "<LastName>", "<UserName>", "<Password>"
    And user clicks on Register
    Then user should register successfully
   Given User clicks on Form Menu

   Examples:
     | FirstName | LastName  | UserName    | Password   |
     | Pranita   | Chaudhari | PranitaUser | Pranitapwd |
     | Savita    | Shinde    | SavitaUser  | Savitapwd  |

   #When we hv example table - then we need scenario outline
