Feature: Verifying Adactine Details

  Scenario Outline: Verifying Adactine Details with valid credential
    Given User in on Adactine Login Page
    When User should enter "<userName>" and "<password>"
    And On Search Hotel PageUser should select details and click on search button
    And On Search Hotel page User should select Hotel and click Continue
    And On Booking Page User should enter "<firstName>","<lastName>" and "<billingAddress>"
    And User should Enter credit card details
      | Credit Card No.  | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 1111222233334444 | American Express | July         |        2022 |        123 |
      | 2222333344445555 | VISA             | July         |        2022 |        325 |
      | 5555666644448888 | Master Card      | July         |        2022 |        562 |
      | 5555666688889999 | Other            | July         |        2022 |        659 |
    And User should enter cvvNum and click BookNow button
    And user should print Booking order number
    Then user should verify success message

    Examples: 
      | userName    | password   | firstName   | lastName | billingAddress     |
      | Kamaleshwar | Kamal@2017 | Kamaleshwar | Murthy   | Chennai, Tamilnadu |
