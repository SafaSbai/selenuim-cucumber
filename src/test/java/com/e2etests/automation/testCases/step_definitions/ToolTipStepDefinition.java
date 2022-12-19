package com.e2etests.automation.testCases.step_definitions;


import com.e2etests.automation.testCases.page_objects.ToolTipPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolTipStepDefinition {
	public ToolTipPage toolTipPage;

	public ToolTipStepDefinition() {
		toolTipPage = new ToolTipPage();
	}
	
	@Given("Je me connecte a mon application {string}")
	public void jeMeConnecteAMonApplication(String url) {
		toolTipPage.openUrl(url);
	}
	@When("Je m agrandis le navigateur")
	public void jeMAgrandisLeNavigateur() {
		toolTipPage.maximizeBrowser();
	}
	@When("Je touche l info bulle")
	public void jeToucheLInfoBulle() {
		toolTipPage.touchOnInfoBulle();
	}
	@Then("Je verifie mon info bulle")
	public void jeVerifieMonInfoBulle() {
		toolTipPage.checkInfoBulle(null);
	}


}
