@Login_HRM
Feature: Login functionality

  Background: Same Steps---

    Given Open the browser
    When  Navigate to OrangeHRM login page

  @Smoke
  Scenario: Login functionality exists

    Given OrangeHRM logo should Exist
    When  Login button should Exist
    Then  Close browser

  @Sanity
  Scenario Outline: Unsuccessful login

    Given Enter invalid <UserName> and <PassWord>
    When  Click on Login button
    Then  Invalid credentials message should be displayed

    Examples:
      | UserName      | PassWord  |
      | standard_user | rana123   |
      | rana_thakur   | secret123 |

  @Regression
  Scenario: Successful login

    Given Enter valid Username and Password
    When  Click on login button
    Then  User should be login

