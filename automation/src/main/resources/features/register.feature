@Register
Feature: Register
  Loading data for register

  #common step for all feature
  Background: 
    Given I want to register a user

  @US001
  Scenario Outline: Register a new User
    When I complete: First Name <first-name> Last Name <last-name> Address <address> Email <email> Phone <phone> Gender <gender> Hobbies <hobbies> Languages <language> Skill <skills> Country <country> Another Country <another-country> Date of Birth Year <date-of-birth-year> Date of Birth Month <date-of-birth-month> Date of Birth Day <date-of-birth-day> Password <password> Confirm Password <confirm-password>
    And I click on Submit
    Then I am redirected to Web Table view <title>

    Examples: 
      | first-name | last-name | address    | email                | phone        | gender | hobbies  | language    | skills | country   | another-country | date-of-birth-year | date-of-birth-month | date-of-birth-day | password  | confirm-password | title                                                |
      | "Ant"      | "Man"     | "Andreani" | "antssassss@gmail.com" | "1468590890" | "Male" | "Movies" | "Bulgarian" | "APIs" | "Albania" | "India"         | "1980"             | "April"             | "20"              | "Pass123" | "Pass123"        | "- Double Click on Edit Icon to EDIT the Table Row." |
