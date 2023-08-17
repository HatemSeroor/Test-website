@smoke
Feature: Follow US | user click on follow us button

  Scenario: user opens facebook link
    Given user login successf
    When user opens facebook link
    Then Check Facebook is opened in new tab

  Scenario: user opens Twitter link
    Given user login successf
    When user opens Twitter link
    Then Check Twitter is opened in new tab

  Scenario: user opens RSS link
    Given user login successf
    When user opens RSS link
    Then Check RSS is opened in new tab

  Scenario: user opens Youtube link
    Given user login successf
    When user opens Youtube link
    Then Check Youtube is opened in new tab