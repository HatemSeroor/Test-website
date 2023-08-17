@smoke
Feature: Login | user could login to the system with valid account
  Scenario: Valid login
    Given Go to login page

    When Enter Valid email "HHHH@aaa.com"
    And Enter Valid password "12378900"
    And Click on login icon
    Then Verify that the user had login successfully

  Scenario: inValid login
    Given Go to login page

    When Enter Invalid email "AAAA@Absd.com"
    And Enter Invalid password "123123123"
    And Click on login icon

    Then Verify that the user had not login successfully


