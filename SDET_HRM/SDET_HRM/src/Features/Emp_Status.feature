@EmpStatus_Job
Feature: Employment Status Functionality

  Background: Login & Job---

    Given Open The Browser.
    When  Navigate To OrangeHRM Login page.
    Then Enter Valid Username And Password.
    And  Click On Login Button.
    And  Able To see dashboard page.
    And Click On Admin.
    And Click On Job & select Employment Status from dropdown

  @Smoke
  Scenario: Add Employment Status

    Given Click On Add button & fill the details.
    When Click On Save button.
    Then Success message Popup should be visible.

  @Sanity
  Scenario: Edit Employment Status

    Given Click On Edit icon in existing record & fill the details
    When Click On Save button..
    Then Able To see the updated record successfully

  @Regression
  Scenario: Delete Employment Status

    Given Click On delete icon in existing record & fill the details
    When Click On Yes,Delete popup
    Then Record Deleted successfully