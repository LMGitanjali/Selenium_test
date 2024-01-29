Feature: Login

  Scenario: Login with Orange HRM
    Given Launch the Chrome browser
    When user opens the url
    And user enter the username and password
    And Click on login button
    Then Home page should be displayed