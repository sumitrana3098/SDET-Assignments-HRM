@JobTitles_Job
Feature: Job Title Functionality

  Background: Login & Job---

    Given Open the Browser.
    When  Navigate to OrangeHRM Login page.
    Then Enter valid Username And Password.
    And  Click on Login Button.
    And  Able to see dashboard page.
    And Click on Admin.
    And Click on Job & select Job Titles from dropdown

  @Smoke
  Scenario: Add Title

    Given Click on Add button & fill the details.
    When Click on Save button.
    Then Success message popup should be visible.

  @Sanity
  Scenario: Edit Title

    Given Click on Edit icon in existing record & fill the details
    When Click on Save button..
    Then Able to see the updated record successfully

  @Regression
  Scenario: Delete Title

    Given Click on delete icon in existing record & fill the details
    When Click on Yes,Delete popup
    Then Record deleted successfully