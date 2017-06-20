
Feature: Valtech test

  Scenario: Latest news section is present
    Given I navigate to valtech homepage
    Then Latest News section is displayed


@test
  Scenario Outline: Pages present on homepage
    Given I navigate to valtech homepage
    When I click on <Page>
    Then <Title> page is displayed
  Examples:
    | Page | Title |
    |ABOUT | About |
    |WORK  | Work  |
    |SERVICES| Services|


  Scenario: All offices of valtech are displayed
    Given I navigate to valtech homepage
    When I navigate to contact Page
    Then All 36 Valtech offices are displayed
