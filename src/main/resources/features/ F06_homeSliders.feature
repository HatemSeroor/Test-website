@smoke
Feature:
  Scenario: first slider is clickable on home page
    When find galaxy slider displayed
    Then click on Galaxy
    And verify that is Url change to Galaxy

  Scenario: second slider is clickable on home page
    When find Iphone slider displayed
    Then click on Iphone
    And verify that is Url change to Iphone


