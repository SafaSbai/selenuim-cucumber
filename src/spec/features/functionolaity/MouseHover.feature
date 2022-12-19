@mouse-hover
Feature: Je souhaite faire un mouse hover

  @mouseho
  Scenario: Je faire un mouse hover
    Given Je faire un implicit wait vers 10 sceonds
    And Je me connecte a l application "https://demoqa.com/menu/"
    When Je agrandis le navigateur utilsee
    And Je touche le main item de mouse hover
    Then Je verifie que le mouse hover est appliquee
