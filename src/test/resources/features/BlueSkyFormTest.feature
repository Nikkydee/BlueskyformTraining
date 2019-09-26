Feature: BlueSky Form Test
  Scenario: Valid Submission 1
    Given I navigate to blueskycitadelform site
    #When I enter first name
    When  I enter firstname "Richard"
    #And I enter Last name
    When  I enter lastname "Adenike"
    And I enter email
    And I enter Email Confirmation
    And I Enter Gender Identification
    And I send Age 31-49
    And I check checkboxlist
   # And I select multiselect
    And I check radiolist
    And I select in select dropdown list
    And I enter single line text
    And I enter paragraph text
    And I enter Address
    And I enter Date
    And I click on submit button
    Then the form is submitted

  Scenario Outline: Valid Submission 2
    Given I navigate to blueskycitadelform site
    When I enter firstname "<firstname>" and lastname "<lastname>" and email "<email>"and confirmemail "<confirmemail>" and gender "<gender>"
    And I send Age 31-49
    And I check checkboxlist
   # And I select multiselect
    And I check radiolist
    And I select in select dropdown list
    And I enter single line text
    And I enter paragraph text
    And I enter Address
    And I enter Date
    And I click on submit button
    Then the form is submitted
      Examples:
      |firstname|lastname|email              |confirmemail       |gender |
      |seunmiiii|fopemiui|nikkydube@gmail.com|nikkydube@gmail.com|male
      |nikkydee|Tehibay  |supbaedbe@gmail.com|supbaedbe@gmail.com|female |





