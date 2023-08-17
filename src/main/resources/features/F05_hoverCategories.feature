@smoke
Feature:hover to category
  Scenario: user hover on list of categories
    Given user login success
    When hover on category list
    And click one sub_category
    Then verify the text on it