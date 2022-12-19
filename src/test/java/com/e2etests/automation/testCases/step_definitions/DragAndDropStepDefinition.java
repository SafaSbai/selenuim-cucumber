package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.DragAndDropPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	public DragAndDropPage draganddropPage;

	public DragAndDropStepDefinition() {
		draganddropPage = new DragAndDropPage();
	}

	@Given("Je me connecte l application {string}")
	public void jeMeConnecteLApplication(String url) {
		draganddropPage.openUrl(url);
	}
	@When("Je agrandis le navigateur utilse")
	public void jeAgrandisLeNavigateurUtilse() {
		draganddropPage.maximizeBrowser();
	}
	@When("Je clique sur drag")
	public void jeCliqueSurDrag() {
		draganddropPage.clickOnButton();
	}
	@When("Je droppe sur drop")
	public void jeDroppeSurDrop() {
		
	}
	@Then("Je verifie si le mot dropped apparait ou non")
	public void jeVerifieSiLeMotDroppedApparaitOuNon() {
	    
	}



}
