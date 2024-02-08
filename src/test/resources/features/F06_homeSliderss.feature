Feature: testing home sliders
  @smoke

  Scenario:first slider is clickable on home page
    Given user is on home page
    When user clicks on the first slider
    Then user should be redirected to "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: second slider is clickable on home page
      Given user is on home page
      When user clicks on the second  slider
      Then user should be redirected to"https://demo.nopcommerce.com/"