@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    Given user go to register page

    When Select Gender "male"
    And Enter FirstName "Hatem"
    And Enter LastName "serous"
    And Enter Day "12"
    And Enter month "5"
    And Enter year "1999"
    And Enter Reg_Email "HHHH@aaa.com"
    And Enter Reg_password "12378900"
    And Enter Conf_password "12378900"
    And click on register button

    Then verify that Iam register successfully
    And click Continue

