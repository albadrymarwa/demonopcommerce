Feature: User Registration
  Scenario: guest user could register with valid data successfully
    Given user is in home page
    When user clicks on register button
    Then user is redirected to register page
    When users enters his first name
And select gender
    And enters his last name
    And select the day of  birth date
    And select the month of  birth date
    And select the year  of  birth date
    And enters his email
    And enters his password
    And enters the same passwords in confirm password
    And clicks on register button
    Then user is redricted to register result page