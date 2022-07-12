Feature: Securian pre-retirement calculator
  @securian
  Scenario: Verify form submission with required fields
    Given user is on the securian pre_retirment calculator page
    Then user enters required fields
    Then user clicks on calculate and verify for submission

  @securian
  Scenario: Verify additional security field is displayed
    Given user is on the securian pre_retirment calculator page
    Then user enters required fields
    Then user enters additional security field
    Then user clicks on calculate and verify for submission

  @securian
  Scenario: Verify form submission with all fields
    Given user is on the securian pre_retirment calculator page
    Then user enters required fields
    Then user enters all fields
    Then user clicks on calculate and verify for submission

  @securian
  Scenario: Verify update default calculator values
    Given user is on the securian pre_retirment calculator page
    Then user updates default calculator values
