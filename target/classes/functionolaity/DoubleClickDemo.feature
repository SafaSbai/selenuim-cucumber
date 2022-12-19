@doubleclickdemo
Feature: je souhaite cliquer sur le boutton deux fois

  @clickdemo
  Scenario: je souhaite cliquer sur le boutton deux fois
    Given je me connecte sur l application "https://demoqa.com/buttons"
    When Je agrandis le navigateur de l application
    And je clique sur le bouton deux fois
    Then je verifie que le message expecte et le message actuelle est le meme ou non 
   