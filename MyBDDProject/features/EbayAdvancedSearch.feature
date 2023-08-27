Feature: Ebay Advanced Search Page

@P24
Scenario: Ebay Logo on Advanced Search

Given I am on Advanced Search Page
When I click on Ebay Logo
Then I am navigated to Ebay Home Page

@P25
Scenario: Ebay Search count
Given Iam on Ebay Home Page
When I search for 'iphone 12'
Then I get atleast 1000 search results

@P26
Scenario: Ebay Search count
  Given Iam on Ebay Home Page
  When I search for "Titanic" in "Art"
  Then I get atleast 2 search results

@P27
Scenario: Advanced search on iteam
  Given I am on Advanced Search Page
  When I advanced serach on a item
    | keyword   | exclude     | min | max  |
    | iPhone 11 | refurbished | 10  | 1000 |
