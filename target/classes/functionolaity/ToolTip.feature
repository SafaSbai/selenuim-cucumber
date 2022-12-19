@tooltip
Feature: Je verifie une info bulle

  @toolti
  Scenario: Je verifie une info bulle

    Given Je me connecte a mon application "http://demoqa.com/tool-tips/"
    When Je m agrandis le navigateur
    And Je touche l info bulle
    Then Je verifie mon info bulle
