Feature: Ebay Home Page Scenarios

@P1 @SenarioSpecificHookBefore @SenarioSpecificHookAfter
Scenario: Advanced Search link

// Given, When and Then

Given I'm on Ebay Home Page
When I click on Advanced link
Then I navigate to Advanced search Page


@P100
Scenario: Advanced Search link
// Given, When and Then
  Given I'm on Amazon Home Page
  When I click on '<link>'
  Then I validate that page navigated to '<url>' and title contains '<title>'

  Examples:
    | link         | url                                                                                              | title       |
    | Sell         | https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3 | CrossShop   |
    | Best Sellers | https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers                                    | Bestsellers |
    | Mobiles      | https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles               | Mobile      |