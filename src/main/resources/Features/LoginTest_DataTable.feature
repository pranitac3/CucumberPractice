
@Login   #This is tag#Scenario level tag, feature level tag
@DataTableTest
Feature: Login
  #Background:
  #  Given User clicks on Home Page - Before ech scenario or scenario outline executes

 Scenario: Login Testing

    #pre-reqiuisite
    Given user is on Login Page
    #Action
    When users enters email and password
      | Email             | Password   |
      | pranita@gmail.com | Pranitapwd |
      | savita@gmail.com  | Savitapwd  |

   #When we hv example table - then we need scenario outline
