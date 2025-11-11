Feature: Add Transaction
  @run
  Scenario: Add new transaction
    Given Pepito is logged into the application
      | user | pass |
    When Pepito enters the required information for the new transaction
      | 12-12-2023 | 500 | testing description |
    Then Pepito should see a new transaction in the transaction list with correct details