
@Login   #This is tag#Scenario level tag, feature level tag
@ExampleTableTestHmeWork
Feature: Login
  #Background:
  #  Given User clicks on Home Page - Before ech scenario or scenario outline executes

 Scenario Outline: Login Testing

    #pre-reqiuisite
    #Action
    When users verify table data "<FirstName>", "<LastName>" for <Index>

   Examples:
     | Index | FirstName | LastName | Age | Email              | Salary | Department |
     | 1     | Cierra    | Vega     | 39  | cierra@example.com | 10000  | Insurance  |
     | 2     | Alden     | Cantrell | 45  | alden@example.com  | 12000  | Compliance |
   #When we hv example table - then we need scenario outline
