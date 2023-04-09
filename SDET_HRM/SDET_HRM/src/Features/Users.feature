@Users_UserManagement
Feature: User Management functionality

  Background: Login & Users---

    Given Open the Browser
    When  Navigate to OrangeHRM Login page
    Then Enter valid Username And Password
    And  Click on Login Button
    And  Able to see dashboard page
    And Click on Admin
    And Click on User Management & select Users from dropdown

  @Smoke
  Scenario: Add User

    Given Click on Add button & fill the details
    When Click on Save button
    Then Success message popup should be visible

  @Sanity
  Scenario: Search User

    Given In system users fill the details
    When Click on Search button
    Then Able to see the record successfully

  @Regression
  Scenario: Delete User

    Given In system users fill the existing details
    When Click on search button
    Then Click on delete icon of record
    And Successfully deleted message should be visible




