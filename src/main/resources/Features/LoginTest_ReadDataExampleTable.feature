
@Login   #This is tag#Scenario level tag, feature level tag
@LoginTest
Feature: Login
  #Background:
  #  Given User clicks on Home Page - Before ech scenario or scenario outline executes

 Scenario Outline: Login Testing

    #pre-reqiuisite
    Given user is on Login Page
    #Action
    When users enters email "<Email>"
    When users enters password "<Password>"
    And user clicks on Login

   Examples:
     | Email             | Password   |
     | pranita@gmail.com | Pranitapwd |
     | savita@gmail.com  | Savitapwd  |

   #When we hv example table - then we need scenario outline
