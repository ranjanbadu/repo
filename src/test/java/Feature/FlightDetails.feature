#Author: your.email@your.domain.com

Feature: Compare data of flight Details
  
  Scenario: Fetch data from web tables and compare it
    Given Navigated to details Page
    And Verify filled details
    And Fetch data from web table to excel
    Then Compare both data
