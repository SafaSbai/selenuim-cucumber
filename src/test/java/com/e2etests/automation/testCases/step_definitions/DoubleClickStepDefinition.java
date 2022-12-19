package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.DoubleClickPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickStepDefinition {
	public DoubleClickPage doubleclickPage;

	public DoubleClickStepDefinition() {
		doubleclickPage = new DoubleClickPage();
	}

	@Given("je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String url) {
	   
		doubleclickPage.openUrl(url);
	}
	@When("Je agrandis le navigateur de l application")
	public void jeAgrandisLeNavigateurDeLApplication() {
	    
		doubleclickPage.maximizeBrowser();
	}
	@When("je clique sur le bouton deux fois")
	public void jeCliqueSurLeBoutonDeuxFois() {
	    
		doubleclickPage.clickOnButton();
	}
	@Then("je verifie que le message expecte et le message actuelle est le meme ou non")
	public void jeVerifieQueLeMessageExpecteEtLeMessageActuelleEstLeMemeOuNon() {
	    
		//doubleclickPage.verifyButton();



}
}
