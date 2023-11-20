Feature: QR Code functionality
   @smoke
  Scenario: verify whether QR code is generated
    Given User is able to login with valid credentials
    When user clicks on banking
    And user click on recieve QR code
    Then enter certain amount
    And click on Generate QR code
    Then check the status
    
     @sanity
  Scenario: verify whether My purchases are done
    Given User is able to login valid credentials
    When user click on Marketplace
    And user click on My purchases
    And user select a status
    Then type a past date