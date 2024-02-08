Feature: currency selection feature
  @smoke

  Scenario: Verify that Euro currency symbol is displayed on products after selecting Euro currency
    Given user is in home page
    When user select Euro currency from dropdown list
    Then Then Euro symbol (€) should be displayed on all products