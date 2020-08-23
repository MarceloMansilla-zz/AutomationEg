@Register
Feature: Register
  Loading data for register

  #common step for all feature
  Background: 
    Given I want to register a user

  @US001
  Scenario Outline: Register
    When I complete First Name <first-name>
    And I complete Last Name <last-name>
    And I complete Address <address>
    And I complete Email <email>
    And I complete Phone <phone>
    And I select Gender <gender>
    And I check Hobbies <hobbies>
    And I select Languages <language>
    And I select Skill <skills>
    And I select Country <country>
    And I select Another Country <another-country>
    And I select Date of Birth Year <date-of-birth-year>
    And I select Date of Birth Month <date-of-birth-month>
    And I select Date of Birth Day <date-of-birth-day>
    And I complete Password <password>
    And I complete Confirm Password <confirm-password>
    And I click on Submit
    Then I am redirected to Web Table view <title>

    Examples: 
      | first-name | last-name | address    | email           | phone        | gender | hobbies            | language    | skills | country   | another-country | date-of-birth-year | date-of-birth-month | date-of-birth-day | password  | confirm-password | title                                                |
      | "Ant"      | "Man"     | "Andreani" | "antass@gmail.com" | "1264590890" | "Male" | "Crisket","Movies" | "Bulgarian" | "APIs" | "Albania" | "India"         | "1980"             | "April"             | "20"              | "Pass123" | "Pass123"        | "- Double Click on Edit Icon to EDIT the Table Row." |
