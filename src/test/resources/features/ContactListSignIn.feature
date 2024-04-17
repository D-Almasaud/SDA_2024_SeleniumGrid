Feature: contact List Sign in

  Scenario: Valid Sign in
    Given User vistis "https://thinking-tester-contact-list.herokuapp.com/"
    When User enters email as "sdatest@tester.com" and password as "tester.123"
    Then User click on submit button
    Then verify logout button displayed
    And close driver
