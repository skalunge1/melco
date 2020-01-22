@HomeScreen
Feature: Home Screen

  @HomeScreenDetails
  Scenario Outline: Melco Android Login
    Given I land on Melco app home screen
    When I sign up the app using "<Username>" and "<Password>"
    Then I land on Home screen successfully 
      
  Examples:
  |Username|Password|
  |3944785|1234|
    