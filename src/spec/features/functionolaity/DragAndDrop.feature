@draganddrop
Feature: Je souhaite dragger et droper

  @drag
  Scenario: Je souhaite dragger et droper
    Given Je me connecte l application "https://demoqa.com/droppable/"
    When Je agrandis le navigateur utilse 
    And Je clique sur drag 
    And Je droppe sur drop 
    Then Je verifie si le mot dropped apparait ou non  