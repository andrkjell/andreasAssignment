Feature: Create Account
 I want to use this feature to test the login function of a website.

  Scenario Outline: Title of your scenario outline
    Given I have logged in at Mailchimp
    And i have entered <email>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | email  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
