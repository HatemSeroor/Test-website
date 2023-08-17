@smoke
Feature:Search for product in the website
  Scenario Outline: user could search using product name (book,laptop,nike)
    Given user login successfully
    When user search with product name in search bar "<ProductName>"
    And click on search button

    Then verify that search done with valid Url Product
    And get number of search

    And verify each result contains the search word "<ProductName>"

    Examples:
      | ProductName |
#     | book        |
      | laptop      |
      | nike        |

  Scenario Outline: user could search using SKU name
    Given user login successfully
    When user search with SKU in search bar "<SKU_Number>"
    And click on search button
    And click on product

    Then verify that SKU is same as search "<SKU_Number>"

    Examples:
      | SKU_Number|
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |