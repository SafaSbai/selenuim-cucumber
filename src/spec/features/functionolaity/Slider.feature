@slider-test
Feature: Je souhaite accepter une alerte

  @slider
  Scenario: Je souhaite glisser
    Given Je connecte a l application "http://demoqa.com/slider/"
    When Je m agrandis le navigateur utilsee
    Then Je glisse la page
    Then Je clique sur le boutton
