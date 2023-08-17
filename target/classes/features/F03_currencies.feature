@smoke
  Feature: Currencies | User can change currency from dollar to euro
    Scenario: User can change currency from dollar to euro
      Given user login successfully
      When we choose from the dropdown the euro
      Then all items will be changed to euro
