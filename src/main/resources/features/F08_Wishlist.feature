@smoke
Feature: F08_WishList | user select product and add it to wishlist

  Scenario: user select product
    Given user login successful
    When user find the feature product and choose wish product
    Then Success massage will appear

  Scenario: user select product and click on it
    Given user login successful
    When user find the feature product and choose wish product
    And Success massage will appear
    And wait until the massage disappear
    Then click in wishlist button at the top
    And check the quantity