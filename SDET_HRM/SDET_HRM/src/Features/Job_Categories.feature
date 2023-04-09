@JobCategories_Job
Feature: Job Categories Functionality

  Background: Login & Job---

    Given Open The Browser..
    When  Navigate To OrangeHRM Login page..
    Then Enter Valid Username And Password..
    And  Click On Login Button..
    And  Able To see dashboard page..
    And Click On Admin..
    And Click On Job & select Job Categories from dropdown

  @Smoke
  Scenario: Add Job Categories

    Given Click On Add button & fill the details..
    When Click On Save button,
    Then Success message Popup should be visible..

  @Sanity
  Scenario: Edit Job Categories

    Given Click On Edit icon in existing record & fill the details.
    When Click On Save button_
    Then Able To see the updated record successfully.

  @Regression
  Scenario: Delete Job Categories

    Given Click On delete icon in existing record & fill the details.
    When Click On Yes,Delete popup.
    Then Record Deleted successfully.