Feature: test sackalert login page

  Scenario: test login with valid credentials
    Given Open required browser
    And Start application with valid URL
    And click signin button
    When I enter valid username manikanta.n@maktronglobal.com and password Maktron@123
    And click on submit button
    Then user should able to login sucessfully
