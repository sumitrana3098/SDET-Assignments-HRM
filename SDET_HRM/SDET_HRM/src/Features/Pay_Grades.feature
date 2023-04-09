@PayGrades_Job
Feature: Pay Grades Functionality

  Background: Login & Job---

    Given Open the Browser..
    When  Navigate to OrangeHRM Login page..
    Then Enter valid Username And Password..
    And  Click on Login Button..
    And  Able to see dashboard page..
    And Click on Admin..
    And Click on Job & select Pay Grades from dropdown

  @Smoke
  Scenario: Add Pay Grade

    Given Click on Add button & fill the details..
    When Click on Save button...
    Then Click on Add Currencies button & fill the details
    And Click on Save Button..
    And Success message popup should be visible..


  @Sanity
  Scenario: Edit Pay Record

    Given Click on Edit icon in existing record & fill the details.
    When Click On Save button...
    Then Able to see the updated record successfully.

  @Regression
  Scenario: Delete Pay Record

    Given Click on delete icon in existing record & fill the details.
    When Click on Yes,Delete popup.
    Then Record deleted successfully.