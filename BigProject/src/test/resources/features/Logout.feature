@Logout
Feature: User logout

  @Logout
  Scenario: User logout
    Given User go to website "Admin" as username and "s3Kol4HQA!*" as password login1
    When User in homepage and click logout button
    Then User logout
