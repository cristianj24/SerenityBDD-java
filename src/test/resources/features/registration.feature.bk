Feature: Registration

  Scenario Outline: Successful registration
    Given Pepito wants to sign up in the application
    When Pepito send the required information to sign up
      | <name> | <last name> | <age> | <email> | <country> |
    Then Pepito should have a new account created
    Examples:
      | name     | last name | age | email             | country |
      | Cristian | Custodio  | 30  | correo@correo.com | Peru    |
      | Pedro    | Ticse     | 35  | correo@correo.com | Peru    |

  Scenario: Missing required fields for registration
    Given Pepito wants to sign up in the application
    When Pepito does not send the required information
    Then Pepito should be told all fields are required