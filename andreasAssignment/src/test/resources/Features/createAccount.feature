Feature: Create Account
 I want to use this feature to test the login function of a website.

  Scenario Outline: Title of your scenario outline
    Given I have opened the Mailchimp login page
   And i have entered <email>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | email  | value | status  |
      | "andrkjell@giganten.se" |     5 | success |
      | "test@test.se" |     7 | Fail    |
